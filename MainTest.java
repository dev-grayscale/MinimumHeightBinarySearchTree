import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

  @Test
  public void test() {
    Assertions.assertNull(Main.build(new int[] {}));

    /**
     * 1
     */
    Node tree1 = Main.build(new int[] { 1 });
    Assertions.assertNotNull(tree1);
    Assertions.assertEquals(1, tree1.value);
    Assertions.assertNull(tree1.left);
    Assertions.assertNull(tree1.right);

    /**
     * 1
     *   2
     */
    Node tree2 = Main.build(new int[] { 1,2 });
    Assertions.assertNotNull(tree2);
    Assertions.assertEquals(1, tree2.value);
    Assertions.assertNull(tree2.left);

    Assertions.assertNotNull(tree2.right);
    Assertions.assertEquals(2, tree2.right.value);
    Assertions.assertNull(tree2.right.left);
    Assertions.assertNull(tree2.right.right);

    /**
     *   2
     * 1   3
     */
    Node tree3 = Main.build(new int[] { 1,2,3 });
    Assertions.assertNotNull(tree3);
    Assertions.assertEquals(2, tree3.value);

    Assertions.assertNotNull(tree3.left);
    Assertions.assertEquals(1, tree3.left.value);

    Assertions.assertNull(tree3.left.left);
    Assertions.assertNull(tree3.left.right);

    Assertions.assertNotNull(tree3.right);
    Assertions.assertEquals(3, tree3.right.value);

    Assertions.assertNull(tree3.right.left);
    Assertions.assertNull(tree3.right.right);

    /**
     *              5
     *        2           8
     *     1     3      6   10
     *             4           12
     */
    Node tree4 = Main.build(new int[] { 1,2,3,4,5,6,8,10,12 });
    Assertions.assertNotNull(tree4);
    Assertions.assertEquals(5, tree4.value);

    // Validate left side

    Assertions.assertNotNull(tree4.left);
    Assertions.assertEquals(2, tree4.left.value);

    Assertions.assertNotNull(tree4.left.left);
    Assertions.assertEquals(1, tree4.left.left.value);

    Assertions.assertNull(tree4.left.left.left);
    Assertions.assertNull(tree4.left.left.right);

    Assertions.assertNotNull(tree4.left.right);
    Assertions.assertEquals(3, tree4.left.right.value);

    Assertions.assertNull(tree4.left.right.left);
    Assertions.assertNotNull(tree4.left.right.right);
    Assertions.assertEquals(tree4.left.right.right.value, 4);

    Assertions.assertNull(tree4.left.right.right.left);
    Assertions.assertNull(tree4.left.right.right.right);

    // Validate right side

    Assertions.assertNotNull(tree4.right);
    Assertions.assertEquals(8, tree4.right.value);

    Assertions.assertNotNull(tree4.right.left);
    Assertions.assertEquals(6, tree4.right.left.value);

    Assertions.assertNull(tree4.right.left.left);
    Assertions.assertNull(tree4.right.left.right);

    Assertions.assertNotNull(tree4.right.right);
    Assertions.assertEquals(10, tree4.right.right.value);

    Assertions.assertNull(tree4.right.right.left);

    Assertions.assertNotNull(tree4.right.right.right);
    Assertions.assertEquals(12, tree4.right.right.right.value);

    Assertions.assertNull(tree4.right.right.right.left);
    Assertions.assertNull(tree4.right.right.right.right);
  }
}
