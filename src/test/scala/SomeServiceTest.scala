import org.specs2._

class SomeServiceTest extends mutable.Specification {

  "Service" should {

    "work" in {
      val service = new SomeService
      service.returnMessage() must startWith("App executed")
    }

  }

}
