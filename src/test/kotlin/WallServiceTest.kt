import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

 class WallServiceTest{

     @Test
     fun updateExisting() {

         val service = WallService()
         service.add(Post(1111111))
         service.add(Post(2222222))
         service.add(Post(3333333))
         val update = Post(0L)
         val result = service.update(update)
     }

     @Before
     fun clearBeforeTest() {
         WallService.clear()
     }



 }


