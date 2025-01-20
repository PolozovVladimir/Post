import org.junit.Assert.*
import org.junit.Test

 class WallServiceTest{

     private val service = WallService()
     @Test
     fun addExisting() {

         val actual = service.add(Post(id = 1111111))

         assertTrue(actual.id != 0L)
     }

     @Test
     fun updateExistingFalse() {

         val actual = service.update(Post(1111111))

         assertFalse(actual)
     }

     @Test
     fun updateExistingTrue() {

         val addeds = service.add(Post(id = 1111111))
         val actual = service.update(addeds.copy(text = "Test"))

         assertTrue(actual)
     }


 }


