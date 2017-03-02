package org.hpi.esb.datavalidator

import org.hpi.esb.datavalidator.config.Configurable
import org.hpi.esb.datavalidator.consumer.Consumer
import org.hpi.esb.datavalidator.util.Logging
import org.hpi.esb.datavalidator.validation.{IdentityValidation, StatisticsValidation}

class Validator extends Configurable with Logging {

  def execute(): Unit = {

    val consumer = new Consumer(config.topics.all, config.consumer)
    val records = consumer.consume()

    val validations = List(
      new IdentityValidation(records.getTopicResults(config.topics.inTopic),
        records.getTopicResults(config.topics.outTopic)),
      new StatisticsValidation(records.getTopicResults(config.topics.inTopic),
        records.getTopicResults(config.topics.statsTopic), config.windowSize)
    )
    validations.foreach(_.fulfillsRequirements())
  }
}