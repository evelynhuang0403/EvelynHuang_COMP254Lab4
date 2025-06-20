/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Exercise1;


import java.util.Iterator;

/**
 * An interface for positional lists.
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 * @see Position
 */
public interface PositionalList<E> extends Iterable<E> {

  /**
   * Returns the number of elements in the list.
   * @return number of elements in the list
   */
  int size();

  /**
   * Tests whether the list is empty.
   * @return true if the list is empty, false otherwise
   */
  boolean isEmpty();

  /**
   * Returns the first com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position in the list.
   *
   * @return the first com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position in the list (or null, if empty)
   */
  Position<E> first();

  /**
   * Returns the last com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position in the list.
   *
   * @return the last com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position in the list (or null, if empty)
   */
  Position<E> last();

  /**
   * Returns the com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position immediately before com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position p.
   * @param p   a com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position of the list
   * @return the com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position of the preceding element (or null, if p is first)
   * @throws IllegalArgumentException if p is not a valid position for this list
   */
  Position<E> before(Position<E> p) throws IllegalArgumentException;

  /**
   * Returns the com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position immediately after com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position p.
   * @param p   a com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position of the list
   * @return the com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position of the following element (or null, if p is last)
   * @throws IllegalArgumentException if p is not a valid position for this list
   */
  Position<E> after(Position<E> p) throws IllegalArgumentException;

  /**
   * Inserts an element at the front of the list.
   *
   * @param e the new element
   * @return the com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position representing the location of the new element
   */
  Position<E> addFirst(E e);

  /**
   * Inserts an element at the back of the list.
   *
   * @param e the new element
   * @return the com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position representing the location of the new element
   */
  Position<E> addLast(E e);

  /**
   * Inserts an element immediately before the given com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position.
   *
   * @param p the com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position before which the insertion takes place
   * @param e the new element
   * @return the com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position representing the location of the new element
   * @throws IllegalArgumentException if p is not a valid position for this list
   */
  Position<E> addBefore(Position<E> p, E e)
    throws IllegalArgumentException;

  /**
   * Inserts an element immediately after the given com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position.
   *
   * @param p the com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position after which the insertion takes place
   * @param e the new element
   * @return the com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position representing the location of the new element
   * @throws IllegalArgumentException if p is not a valid position for this list
   */
  Position<E> addAfter(Position<E> p, E e)
    throws IllegalArgumentException;

  /**
   * Replaces the element stored at the given com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position and returns the replaced element.
   *
   * @param p the com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position of the element to be replaced
   * @param e the new element
   * @return the replaced element
   * @throws IllegalArgumentException if p is not a valid position for this list
   */
  E set(Position<E> p, E e) throws IllegalArgumentException;

  /**
   * Removes the element stored at the given com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position and returns it.
   * The given position is invalidated as a result.
   *
   * @param p the com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position of the element to be removed
   * @return the removed element
   * @throws IllegalArgumentException if p is not a valid position for this list
   */
  E remove(Position<E> p) throws IllegalArgumentException;

  /**
   * Returns an iterator of the elements stored in the list.
   * @return iterator of the list's elements
   */
  Iterator<E> iterator();

  /**
   * Returns the positions of the list in iterable form from first to last.
   * @return iterable collection of the list's positions
   */
  Iterable<Position<E>> positions();

  /**
   * Returns the index of the given position in the list.
   * @return index of the position (0-based)
   * @throws IllegalArgumentException if p is not a valid position for this list
   */
  int indexOf(Position<E> p);
}
