import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

 class WallServiceTest{

     @Test
     fun addExisting() {

         val service = WallService()
         val actual = service.add(Post(1111111))

         assertTrue(actual.id != 0L)
     }

     @Test
     fun updateExistingFalse() {

         val service = WallService()
         val actual = service.update(Post(1111111))

         assertFalse(actual)
     }

     @Test
     fun updateExistingTrue() {

         val service = WallService()
         val addeds = service.add(Post(id = 1111111))
         val actual = service.update(addeds.copy(text = "Test"))

         assertTrue(actual)
     }


 }


