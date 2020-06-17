import org.apache.spark.{SparkConf, SparkContext}

object HelloSpark {

  def main(args: Array[String]): Unit = {
    val myFile = "assets/featuresdf.csv"
    // local[2] = 2 cores are used
    val conf = new SparkConf().setAppName("Hello Spark").setMaster("local[2]")
    val sc = new SparkContext(conf)
    val txtFileLines = sc.textFile(myFile, 2).cache()
    val numAs = txtFileLines.filter(line => line.contains("Weeknd")).count()
    println("Hello Spark")
    println("Lines containing Weeknd: %s".format(numAs))
    println("Lines: %s".format(txtFileLines.count()))
  }
}
