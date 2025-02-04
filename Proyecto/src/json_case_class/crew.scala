package json_case_class

case class crew(
                    credit_id: String,
                    department: String,
                    gender: Int,
                    id: Int,
                    job: String,
                    name: String,
                    profile_path: String
                  )

object crew {
  implicit val crewReads: Reads[crew] = Json.reads[crew]
}
