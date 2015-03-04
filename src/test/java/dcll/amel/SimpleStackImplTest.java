package dcll.amel;

import junit.framework.Assert;
import org.junit.Before;

import static org.junit.Assert.*;

public class SimpleStackImplTest {

    SimpleStack simpleStack;

    @Before
    public void setUp() throws Exception{
        simpleStack = new SimpleStackImpl();
        System.out.println("Je suis exécuté avant chaque test");
    }
    @org.junit.Test
    public void testIsEmpty() throws Exception {
        Assert.assertEquals(true,simpleStack.isEmpty());
        String e1= "toto";
        simpleStack.push(new Item(new String(e1)));
        Assert.assertEquals(false,simpleStack.isEmpty());
    }

    @org.junit.Test
    public void testGetSize() throws Exception {
        Assert.assertEquals(0,simpleStack.getSize());
        String e1= "toto";
        simpleStack.push(new Item(new String(e1)));
        simpleStack.push(new Item(new String(e1+"2")));
        Assert.assertEquals(2,simpleStack.getSize());
    }

    @org.junit.Test
    public void testPush() throws Exception {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0,simpleStack.getSize());
        simpleStack.push(ita);
        Assert.assertEquals(1,simpleStack.getSize());
        Item o = simpleStack.peek();
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer) o.getValue();
        Assert.assertEquals(8,integer.intValue());
        Assert.assertEquals(ita.getValue(),integer);
    }

    @org.junit.Test
    public void testPeek() throws Exception {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0,simpleStack.getSize());
        simpleStack.push(ita);
        Assert.assertEquals(1,simpleStack.getSize());
        Item o = simpleStack.peek();
        Assert.assertEquals(1,simpleStack.getSize());
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer) o.getValue();
        Assert.assertEquals(8,integer.intValue());
        Assert.assertEquals(ita.getValue(),integer);
    }

    @org.junit.Test
    public void testPop() throws Exception {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0,simpleStack.getSize());
        simpleStack.push(ita);
        Assert.assertEquals(1,simpleStack.getSize());
        Item o = simpleStack.pop();
        Assert.assertEquals(0,simpleStack.getSize());
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer) o.getValue();
        Assert.assertEquals(8,integer.intValue());
        Assert.assertEquals(ita.getValue(),integer);
    }



}