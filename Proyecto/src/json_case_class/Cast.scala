package json_case_class

case class Cast(
                  cast_id: Int,
                  character: String,
                  credit_id: String,
                  gender: Int,
                  id: Int,
                  name: String,
                  order: Int,
                  profile_path: String
                  )
object Cast {
  implicit val castReads: Reads[Cast] = Json.reads[Cast]
}
