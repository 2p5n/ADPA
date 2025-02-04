package json_case_class

case class Companie(
                     id: Int,
                     name: String
                   )

object Companie {
  implicit val companieReads: Reads[Companie] = Json.reads[Companie]
}
