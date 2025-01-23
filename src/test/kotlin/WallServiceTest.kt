import org.junit.Assert.*
import org.junit.Test
import Comments as Comments1

class WallServiceTest{


     @Test

     fun addExisting() {
         val service = WallService()
         val actual = service.add(Post(id = 1111111))

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

     @Test(expected = PostNotFoundException::class)
     fun shouldThrow() {
         val service = WallService()
         val comment = Comment(1, 1, 1, "comment")
         service.createComment(3, comment)

     }
     @Test
     fun shouldWork(){
         val service = WallService()
         val actual: Comment = service.createComment (1, comment = Comment(1,1,1,"comment"))

         assertTrue(actual.id != 1)
     }

 }


