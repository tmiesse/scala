/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2010, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */
package scala.annotation

/** <p>
 *    A method annotation which instructs the compiler to generate a
 *    Java varargs-style forwarder method for interop. This annotation can
 *    only be applied to methods with repeated parameters.
 *  </p>
 *
 *  @since 2.9
 */
final class varargs extends StaticAnnotation
