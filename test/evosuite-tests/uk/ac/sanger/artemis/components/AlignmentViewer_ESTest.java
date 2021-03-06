/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 11:34:47 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.AlignMatch;
import uk.ac.sanger.artemis.BlastM8ComparisonData;
import uk.ac.sanger.artemis.components.AlignmentViewer;
import uk.ac.sanger.artemis.components.FeatureDisplay;
import uk.ac.sanger.artemis.io.Range;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AlignmentViewer_ESTest extends AlignmentViewer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Range range0 = new Range(0, 0);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 762, (-30000));
      int int0 = AlignmentViewer.getRealQuerySequenceStart(alignMatch0, (-5438), true);
      assertEquals((-5437), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Range range0 = new Range((-1153));
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, (-1153), (-1153));
      int int0 = AlignmentViewer.getRealQuerySequenceStart(alignMatch0, (-2284), true);
      assertEquals((-1130), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Range range0 = new Range((-5), 2042);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 0, (-1082));
      int int0 = AlignmentViewer.getRealQuerySequenceEnd(alignMatch0, 3, false);
      assertEquals((-5), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        AlignmentViewer.getRealSubjectSequenceEnd((AlignMatch) null, 1798, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.AlignmentViewer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        AlignmentViewer.getRealQuerySequenceEnd((AlignMatch) null, 2, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.AlignmentViewer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Range range0 = new Range(0, 0);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 762, (-30000));
      int int0 = AlignmentViewer.getRealQuerySequenceEnd(alignMatch0, 3000, true);
      assertEquals(3001, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Range range0 = new Range(0, 0);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 762, (-30000));
      int int0 = AlignmentViewer.getRealQuerySequenceEnd(alignMatch0, 3000, false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Range range0 = new Range((-1153));
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, (-1153), (-1153));
      int int0 = AlignmentViewer.getRealQuerySequenceStart(alignMatch0, (-1153), true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        AlignmentViewer.getRealQuerySequenceStart((AlignMatch) null, 0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.AlignmentViewer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Range range0 = new Range((-806), (-806));
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, (-806), 0);
      int int0 = AlignmentViewer.getRealSubjectSequenceEnd(alignMatch0, 120000, true);
      assertEquals(120807, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Range range0 = new Range((-806), (-806));
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, (-806), 0);
      int int0 = AlignmentViewer.getRealSubjectSequenceEnd(alignMatch0, 120018, false);
      assertEquals((-806), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        AlignmentViewer.getRealSubjectSequenceStart((AlignMatch) null, 3, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.AlignmentViewer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BlastM8ComparisonData blastM8ComparisonData0 = new BlastM8ComparisonData();
      AlignmentViewer alignmentViewer0 = null;
      try {
        alignmentViewer0 = new AlignmentViewer((FeatureDisplay) null, (FeatureDisplay) null, blastM8ComparisonData0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.AlignmentViewer", e);
      }
  }
}
