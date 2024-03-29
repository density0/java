package lists;

/**
 * UnorderedListADT.java
 * Defines the interface to an unordered list collection. Elements
 * can be stored in any order. 
 * 
 * @author Lewis/Chase
 */
public interface UnorderedListADT<E> extends ListADT<E>
{
   /**  Adds the specified item to the front of this list. */
   public void addToFront (E item);

   /**  Adds the specified item to the rear of this list. */
   public void addToRear (E item);

   /**  Adds the specified item after the specified target. */
   public void addAfter (E item, E target);
}