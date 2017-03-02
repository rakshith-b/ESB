[![Build Status](https://travis-ci.org/BenReissaus/ESB-DataSender.svg?branch=master)](https://travis-ci.org/BenReissaus/ESB-DataSender)

## Datasender configuration
The datasender expects a `datasender.conf` file in the current directory (`user.dir`).
Example content (some properties are overwritable via cli):
```
datasender.dataInputPath = "/home/benchmarker/Benchmarks/ESB/Data/DEBS2012-5Minutes.txt"
datasender.sendingInterval = 100
datasender.columnDelimiter = "s+"
datasender.numberOfThreads = 1
datasender.kafkaProducer.bootstrapServers = "192.168.30.208:9092,192.168.30.207:9092,192.168.30.141:9092"
datasender.kafkaProducer.keySerializerClass = "org.apache.kafka.common.serialization.StringSerializer"
datasender.kafkaProducer.valueSerializerClass = "org.apache.kafka.common.serialization.StringSerializer"
datasender.kafkaProducer.acks = 0
datasender.kafkaProducer.batchSize = 1

datasender.dataModel.columns = ["ts", "index", "mf01", "mf02", "mf03", "pc13", "pc14", "pc15", "pc25", "pc26", "pc27", "res", "bm05", "bm06", "bm07", "bm08", "bm09", "bm10", "pp01", "pp02", "pp03", "pp04", "pp05",
    "pp06", "pp07", "pp08", "pp09", "pp10", "pp11", "pp12", "pp13", "pp14", "pp15", "pp16", "pp17", "pp18", "pp19", "pp20", "pp21", "pp22", "pp23", "pp24", "pp25", "pp26", "pp27", "pp28", "pp29", "pp30", "pp31", "pp32",
    "pp33", "pp34", "pp35", "pp36", "tbd1", "tbd2"]
datasender.dataModel.columnStart = 2
datasender.dataModel.columnEnd = 2
```