package agh.ics.oop;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractWorldMap implements IWorldMap, IPositionChangeObserver {
    private static final Vector2d MARGIN = new Vector2d(3, 3);
    private final MapVisualizer visualizer = new MapVisualizer(this);
    private final Map<Vector2d, Animal> animals = new HashMap<>();

    protected Rect getDrawingBounds() {
        Rect bounds = animals.values().stream()
                .map(a -> new Rect(a.getPos(), a.getPos()))
                .findFirst()
                .orElse(new Rect(0, 0, 0, 0));

        for (Animal a : animals.values()) {
            bounds = bounds.extendedTo(a.getPos());
        }

        return new Rect(
                bounds.getBL().subtract(MARGIN),
                bounds.getTR().add(MARGIN)
        );
    }

    @Override
    public String toString() {
        Rect bounds = getDrawingBounds();
        return visualizer.draw(bounds.getBL(), bounds.getTR());
    }

    @Override
    public boolean place(Animal animal) {
        if (!canMoveTo(animal.getPos())) {
            return false;
        }
        animals.put(animal.getPos(), animal);
        animal.addObserver(this);
        return true;
    }

    @Override
    public boolean canMoveTo(Vector2d position) {
        return !animals.containsKey(position);
    }

    @Override
    public boolean isOccupied(Vector2d position) {
        return animals.containsKey(position);
    }

    @Override
    public Object objectAt(Vector2d position) {
        return animals.get(position);
    }

    @Override
    public void positionChanged(Vector2d oldPosition, Vector2d newPosition) {
        Animal a = animals.remove(oldPosition);
        animals.put(newPosition, a);
    }
}