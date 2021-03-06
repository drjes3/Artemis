/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 13:50:42 GMT 2018
 */

package uk.ac.sanger.artemis.editor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.editor.DBViewer;
import uk.ac.sanger.artemis.editor.FastaTextPane;
import uk.ac.sanger.artemis.util.FileDocument;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DBViewer_ESTest extends DBViewer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockFile mockFile0 = new MockFile("GET CHILDREN OF ");
      FileDocument fileDocument0 = new FileDocument(mockFile0);
      FastaTextPane fastaTextPane0 = new FastaTextPane(fileDocument0);
      DBViewer dBViewer0 = null;
      try {
        dBViewer0 = new DBViewer(fastaTextPane0, fastaTextPane0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.DBViewer", e);
      }
  }
}
