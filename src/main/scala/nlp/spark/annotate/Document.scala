package nlp.spark.annotate

import scala.collection.immutable.TreeSet

/**
  *
  * @param docName the name of the document
  * @param text the contents of the document
  * @param metadata the metadata associated with the document
  * @param annotations the annotations found in the document
  */
case class Document(
  docName: String,
  text: String,
  metadata: Map[String, String] = Map(),
  annotations: TreeSet[Annotation] = TreeSet())