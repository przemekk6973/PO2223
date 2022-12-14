package agh.ics.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    void testToString() {
        assertEquals("^", new Animal(null).toString());
    }

    @Test
    void testIsAt() {
        assertTrue(new Animal(null).isAt(new Vector2d(2, 2)));
        assertFalse(new Animal(null).isAt(new Vector2d(2, 3)));
    }

    @Test
    void testMove2() {
        Animal a = new Animal(new RectangularMap(5, 5));
        a.move(MoveDirection.RIGHT);
        a.move(MoveDirection.FORWARD);
        a.move(MoveDirection.FORWARD);
        a.move(MoveDirection.FORWARD);
        assertEquals(new Vector2d(4, 2), a.getPosition());
        assertEquals(MapDirection.EAST, a.getDirection());
    }

    @Test
    void testMove() {
        Animal a = new Animal(new RectangularMap(5, 5));
        assertEquals(new Vector2d(2, 2), a.getPosition());
        assertEquals(MapDirection.NORTH, a.getDirection());

        a.move(MoveDirection.FORWARD);
        assertEquals(new Vector2d(2, 3), a.getPosition());
        assertEquals(MapDirection.NORTH, a.getDirection());

        a.move(MoveDirection.FORWARD);
        assertEquals(new Vector2d(2, 4), a.getPosition());
        assertEquals(MapDirection.NORTH, a.getDirection());

        a.move(MoveDirection.FORWARD);
        assertEquals(new Vector2d(2, 4), a.getPosition());
        assertEquals(MapDirection.NORTH, a.getDirection());

        a.move(MoveDirection.BACKWARD);
        assertEquals(new Vector2d(2, 3), a.getPosition());
        assertEquals(MapDirection.NORTH, a.getDirection());

        a.move(MoveDirection.RIGHT);
        assertEquals(new Vector2d(2, 3), a.getPosition());
        assertEquals(MapDirection.EAST, a.getDirection());

        a.move(MoveDirection.FORWARD);
        assertEquals(new Vector2d(3, 3), a.getPosition());
        assertEquals(MapDirection.EAST, a.getDirection());

        a.move(MoveDirection.LEFT);
        assertEquals(new Vector2d(3, 3), a.getPosition());
        assertEquals(MapDirection.NORTH, a.getDirection());

        a.move(MoveDirection.LEFT);
        assertEquals(new Vector2d(3, 3), a.getPosition());
        assertEquals(MapDirection.WEST, a.getDirection());

        a.move(MoveDirection.BACKWARD);
        assertEquals(new Vector2d(4, 3), a.getPosition());
        assertEquals(MapDirection.WEST, a.getDirection());

        a.move(MoveDirection.LEFT);
        assertEquals(new Vector2d(4, 3), a.getPosition());
        assertEquals(MapDirection.SOUTH, a.getDirection());

        a.move(MoveDirection.FORWARD);
        assertEquals(new Vector2d(4, 2), a.getPosition());
        assertEquals(MapDirection.SOUTH, a.getDirection());

        a.move(MoveDirection.FORWARD);
        assertEquals(new Vector2d(4, 1), a.getPosition());
        assertEquals(MapDirection.SOUTH, a.getDirection());

        a.move(MoveDirection.FORWARD);
        assertEquals(new Vector2d(4, 0), a.getPosition());
        assertEquals(MapDirection.SOUTH, a.getDirection());

        a.move(MoveDirection.FORWARD);
        assertEquals(new Vector2d(4, 0), a.getPosition());
        assertEquals(MapDirection.SOUTH, a.getDirection());

        a.move(MoveDirection.RIGHT);
        assertEquals(new Vector2d(4, 0), a.getPosition());
        assertEquals(MapDirection.WEST, a.getDirection());

        a.move(MoveDirection.FORWARD);
        assertEquals(new Vector2d(3, 0), a.getPosition());
        assertEquals(MapDirection.WEST, a.getDirection());

        a.move(MoveDirection.FORWARD);
        assertEquals(new Vector2d(2, 0), a.getPosition());
        assertEquals(MapDirection.WEST, a.getDirection());

        a.move(MoveDirection.FORWARD);
        assertEquals(new Vector2d(1, 0), a.getPosition());
        assertEquals(MapDirection.WEST, a.getDirection());

        a.move(MoveDirection.FORWARD);
        assertEquals(new Vector2d(0, 0), a.getPosition());
        assertEquals(MapDirection.WEST, a.getDirection());

        a.move(MoveDirection.FORWARD);
        assertEquals(new Vector2d(0, 0), a.getPosition());
        assertEquals(MapDirection.WEST, a.getDirection());

        a.move(MoveDirection.BACKWARD);
        assertEquals(new Vector2d(1, 0), a.getPosition());
        assertEquals(MapDirection.WEST, a.getDirection());

        a.move(MoveDirection.BACKWARD);
        assertEquals(new Vector2d(2, 0), a.getPosition());
        assertEquals(MapDirection.WEST, a.getDirection());

        a.move(MoveDirection.BACKWARD);
        assertEquals(new Vector2d(3, 0), a.getPosition());
        assertEquals(MapDirection.WEST, a.getDirection());

        a.move(MoveDirection.BACKWARD);
        assertEquals(new Vector2d(4, 0), a.getPosition());
        assertEquals(MapDirection.WEST, a.getDirection());

        a.move(MoveDirection.BACKWARD);
        assertEquals(new Vector2d(4, 0), a.getPosition());
        assertEquals(MapDirection.WEST, a.getDirection());
    }
}