import org.junit.Assert.*
import org.junit.Test
import Comments as Comments1

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

     @Test(expected = PostNotFoundException::class)
     fun shouldThrow() {
         val comment = Comment(1, 1, 1, "comment")
         service.createComment(3, comment)

     }
     @Test
     fun shouldWork(){
         val actual: Comment = service.createComment (1, comment = Comment(1,1,1,"comment"))

         assertTrue(actual.id != 1)
     }

 }


