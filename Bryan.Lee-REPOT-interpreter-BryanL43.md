

# Grading Report for P1



## Student Name: 

Bryan.Lee


## Commit Count: 

11



## Git Diff Since Base Commit: 


<details>
    <summary>Git Diff</summary>

~~~bash
diff --git a/.idea/.gitignore b/.idea/.gitignore
new file mode 100644
index 0000000..f78d8ff
--- /dev/null
+++ b/.idea/.gitignore
@@ -0,0 +1,9 @@
+# Default ignored files
+/shelf/
+/workspace.xml
+# Editor-based HTTP Client requests
+/httpRequests/
+# Datasource local storage ignored files
+/dataSources/
+/dataSources.local.xml
+/out/
\ No newline at end of file
diff --git a/.idea/misc.xml b/.idea/misc.xml
new file mode 100644
index 0000000..6f29fee
--- /dev/null
+++ b/.idea/misc.xml
@@ -0,0 +1,6 @@
+<?xml version="1.0" encoding="UTF-8"?>
+<project version="4">
+  <component name="ProjectRootManager" version="2" languageLevel="JDK_21" default="true" project-jdk-name="21" project-jdk-type="JavaSDK">
+    <output url="file://$PROJECT_DIR$/out" />
+  </component>
+</project>
\ No newline at end of file
diff --git a/.idea/modules.xml b/.idea/modules.xml
new file mode 100644
index 0000000..ab3d90a
--- /dev/null
+++ b/.idea/modules.xml
@@ -0,0 +1,8 @@
+<?xml version="1.0" encoding="UTF-8"?>
+<project version="4">
+  <component name="ProjectModuleManager">
+    <modules>
+      <module fileurl="file://$PROJECT_DIR$/interpreter-BryanL43.iml" filepath="$PROJECT_DIR$/interpreter-BryanL43.iml" />
+    </modules>
+  </component>
+</project>
\ No newline at end of file
diff --git a/.idea/uiDesigner.xml b/.idea/uiDesigner.xml
new file mode 100644
index 0000000..2b63946
--- /dev/null
+++ b/.idea/uiDesigner.xml
@@ -0,0 +1,124 @@
+<?xml version="1.0" encoding="UTF-8"?>
+<project version="4">
+  <component name="Palette2">
+    <group name="Swing">
+      <item class="com.intellij.uiDesigner.HSpacer" tooltip-text="Horizontal Spacer" icon="/com/intellij/uiDesigner/icons/hspacer.svg" removable="false" auto-create-binding="false" can-attach-label="false">
+        <default-constraints vsize-policy="1" hsize-policy="6" anchor="0" fill="1" />
+      </item>
+      <item class="com.intellij.uiDesigner.VSpacer" tooltip-text="Vertical Spacer" icon="/com/intellij/uiDesigner/icons/vspacer.svg" removable="false" auto-create-binding="false" can-attach-label="false">
+        <default-constraints vsize-policy="6" hsize-policy="1" anchor="0" fill="2" />
+      </item>
+      <item class="javax.swing.JPanel" icon="/com/intellij/uiDesigner/icons/panel.svg" removable="false" auto-create-binding="false" can-attach-label="false">
+        <default-constraints vsize-policy="3" hsize-policy="3" anchor="0" fill="3" />
+      </item>
+      <item class="javax.swing.JScrollPane" icon="/com/intellij/uiDesigner/icons/scrollPane.svg" removable="false" auto-create-binding="false" can-attach-label="true">
+        <default-constraints vsize-policy="7" hsize-policy="7" anchor="0" fill="3" />
+      </item>
+      <item class="javax.swing.JButton" icon="/com/intellij/uiDesigner/icons/button.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="0" hsize-policy="3" anchor="0" fill="1" />
+        <initial-values>
+          <property name="text" value="Button" />
+        </initial-values>
+      </item>
+      <item class="javax.swing.JRadioButton" icon="/com/intellij/uiDesigner/icons/radioButton.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="0" hsize-policy="3" anchor="8" fill="0" />
+        <initial-values>
+          <property name="text" value="RadioButton" />
+        </initial-values>
+      </item>
+      <item class="javax.swing.JCheckBox" icon="/com/intellij/uiDesigner/icons/checkBox.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="0" hsize-policy="3" anchor="8" fill="0" />
+        <initial-values>
+          <property name="text" value="CheckBox" />
+        </initial-values>
+      </item>
+      <item class="javax.swing.JLabel" icon="/com/intellij/uiDesigner/icons/label.svg" removable="false" auto-create-binding="false" can-attach-label="false">
+        <default-constraints vsize-policy="0" hsize-policy="0" anchor="8" fill="0" />
+        <initial-values>
+          <property name="text" value="Label" />
+        </initial-values>
+      </item>
+      <item class="javax.swing.JTextField" icon="/com/intellij/uiDesigner/icons/textField.svg" removable="false" auto-create-binding="true" can-attach-label="true">
+        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1">
+          <preferred-size width="150" height="-1" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JPasswordField" icon="/com/intellij/uiDesigner/icons/passwordField.svg" removable="false" auto-create-binding="true" can-attach-label="true">
+        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1">
+          <preferred-size width="150" height="-1" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JFormattedTextField" icon="/com/intellij/uiDesigner/icons/formattedTextField.svg" removable="false" auto-create-binding="true" can-attach-label="true">
+        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1">
+          <preferred-size width="150" height="-1" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JTextArea" icon="/com/intellij/uiDesigner/icons/textArea.svg" removable="false" auto-create-binding="true" can-attach-label="true">
+        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">
+          <preferred-size width="150" height="50" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JTextPane" icon="/com/intellij/uiDesigner/icons/textPane.svg" removable="false" auto-create-binding="true" can-attach-label="true">
+        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">
+          <preferred-size width="150" height="50" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JEditorPane" icon="/com/intellij/uiDesigner/icons/editorPane.svg" removable="false" auto-create-binding="true" can-attach-label="true">
+        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">
+          <preferred-size width="150" height="50" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JComboBox" icon="/com/intellij/uiDesigner/icons/comboBox.svg" removable="false" auto-create-binding="true" can-attach-label="true">
+        <default-constraints vsize-policy="0" hsize-policy="2" anchor="8" fill="1" />
+      </item>
+      <item class="javax.swing.JTable" icon="/com/intellij/uiDesigner/icons/table.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">
+          <preferred-size width="150" height="50" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JList" icon="/com/intellij/uiDesigner/icons/list.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="6" hsize-policy="2" anchor="0" fill="3">
+          <preferred-size width="150" height="50" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JTree" icon="/com/intellij/uiDesigner/icons/tree.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">
+          <preferred-size width="150" height="50" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JTabbedPane" icon="/com/intellij/uiDesigner/icons/tabbedPane.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="3" hsize-policy="3" anchor="0" fill="3">
+          <preferred-size width="200" height="200" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JSplitPane" icon="/com/intellij/uiDesigner/icons/splitPane.svg" removable="false" auto-create-binding="false" can-attach-label="false">
+        <default-constraints vsize-policy="3" hsize-policy="3" anchor="0" fill="3">
+          <preferred-size width="200" height="200" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JSpinner" icon="/com/intellij/uiDesigner/icons/spinner.svg" removable="false" auto-create-binding="true" can-attach-label="true">
+        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1" />
+      </item>
+      <item class="javax.swing.JSlider" icon="/com/intellij/uiDesigner/icons/slider.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1" />
+      </item>
+      <item class="javax.swing.JSeparator" icon="/com/intellij/uiDesigner/icons/separator.svg" removable="false" auto-create-binding="false" can-attach-label="false">
+        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3" />
+      </item>
+      <item class="javax.swing.JProgressBar" icon="/com/intellij/uiDesigner/icons/progressbar.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="0" hsize-policy="6" anchor="0" fill="1" />
+      </item>
+      <item class="javax.swing.JToolBar" icon="/com/intellij/uiDesigner/icons/toolbar.svg" removable="false" auto-create-binding="false" can-attach-label="false">
+        <default-constraints vsize-policy="0" hsize-policy="6" anchor="0" fill="1">
+          <preferred-size width="-1" height="20" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JToolBar$Separator" icon="/com/intellij/uiDesigner/icons/toolbarSeparator.svg" removable="false" auto-create-binding="false" can-attach-label="false">
+        <default-constraints vsize-policy="0" hsize-policy="0" anchor="0" fill="1" />
+      </item>
+      <item class="javax.swing.JScrollBar" icon="/com/intellij/uiDesigner/icons/scrollbar.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="6" hsize-policy="0" anchor="0" fill="2" />
+      </item>
+    </group>
+  </component>
+</project>
\ No newline at end of file
diff --git a/.idea/vcs.xml b/.idea/vcs.xml
new file mode 100644
index 0000000..35eb1dd
--- /dev/null
+++ b/.idea/vcs.xml
@@ -0,0 +1,6 @@
+<?xml version="1.0" encoding="UTF-8"?>
+<project version="4">
+  <component name="VcsDirectoryMappings">
+    <mapping directory="" vcs="Git" />
+  </component>
+</project>
\ No newline at end of file
diff --git a/README.md b/README.md
index 2b9a292..54adfce 100644
--- a/README.md
+++ b/README.md
@@ -1,7 +1,7 @@
 # CSC 413 - Project Two - The Interpreter
 
-## Student Name  : Name here
+## Student Name  : Bryan Lee
 
-## Student ID    : ID here
+## Student ID    : 922649673
 
-## Student Email : Email here
+## Student Email : blee37@sfsu.edu
diff --git a/documentation/Interpreter_Diagram_Plan.png b/documentation/Interpreter_Diagram_Plan.png
new file mode 100644
index 0000000..e40c416
Binary files /dev/null and b/documentation/Interpreter_Diagram_Plan.png differ
diff --git a/documentation/Lee_Bryan.pdf b/documentation/Lee_Bryan.pdf
new file mode 100644
index 0000000..d75ceeb
Binary files /dev/null and b/documentation/Lee_Bryan.pdf differ
diff --git a/documentation/UML_Interpreter.png b/documentation/UML_Interpreter.png
new file mode 100644
index 0000000..57d12d8
Binary files /dev/null and b/documentation/UML_Interpreter.png differ
diff --git a/documentation/lastname_firstname.docx b/documentation/lastname_firstname.docx
deleted file mode 100644
index 1cd426f..0000000
Binary files a/documentation/lastname_firstname.docx and /dev/null differ
diff --git a/interpreter-BryanL43.iml b/interpreter-BryanL43.iml
new file mode 100644
index 0000000..b107a2d
--- /dev/null
+++ b/interpreter-BryanL43.iml
@@ -0,0 +1,11 @@
+<?xml version="1.0" encoding="UTF-8"?>
+<module type="JAVA_MODULE" version="4">
+  <component name="NewModuleRootManager" inherit-compiler-output="true">
+    <exclude-output />
+    <content url="file://$MODULE_DIR$">
+      <sourceFolder url="file://$MODULE_DIR$" isTestSource="false" />
+    </content>
+    <orderEntry type="inheritedJdk" />
+    <orderEntry type="sourceFolder" forTests="false" />
+  </component>
+</module>
\ No newline at end of file
diff --git a/interpreter/bytecodes/ArgsCode.java b/interpreter/bytecodes/ArgsCode.java
new file mode 100644
index 0000000..9029141
--- /dev/null
+++ b/interpreter/bytecodes/ArgsCode.java
@@ -0,0 +1,21 @@
+package interpreter.bytecodes;
+
+import interpreter.virtualmachine.VirtualMachine;
+
+public class ArgsCode implements ByteCode {
+    private int offSetFromTop;
+
+    public ArgsCode(String[] args) {
+        offSetFromTop = Integer.parseInt(args[0]);
+    }
+
+    @Override
+    public void execute(VirtualMachine vm) {
+        vm.newFrameAt(offSetFromTop);
+    }
+
+    @Override
+    public String toString() {
+        return "ARGS " + offSetFromTop;
+    }
+}
\ No newline at end of file
diff --git a/interpreter/bytecodes/BopCode.java b/interpreter/bytecodes/BopCode.java
new file mode 100644
index 0000000..eb4db42
--- /dev/null
+++ b/interpreter/bytecodes/BopCode.java
@@ -0,0 +1,38 @@
+package interpreter.bytecodes;
+
+import interpreter.virtualmachine.VirtualMachine;
+
+public class BopCode implements ByteCode {
+    private String operator;
+
+    public BopCode(String[] args) {
+        operator = args[0];
+    }
+
+    @Override
+    public void execute(VirtualMachine vm) {
+        int secondOperand = vm.pop(1);
+        int firstOperand = vm.pop(1);
+
+        switch(operator) {
+            case "+" -> vm.push(firstOperand + secondOperand);
+            case "-" -> vm.push(firstOperand - secondOperand);
+            case "/" -> vm.push(firstOperand / secondOperand);
+            case "*" -> vm.push(firstOperand * secondOperand);
+            case "==" -> vm.push(firstOperand == secondOperand ? 1 : 0);
+            case "!=" -> vm.push(firstOperand != secondOperand ? 1 : 0);
+            case "<=" -> vm.push(firstOperand <= secondOperand ? 1 : 0);
+            case ">=" -> vm.push(firstOperand >= secondOperand ? 1 : 0);
+            case "<" -> vm.push(firstOperand < secondOperand ? 1 : 0);
+            case ">" -> vm.push(firstOperand > secondOperand ? 1 : 0);
+            case "&" -> vm.push((firstOperand == 1) && (secondOperand == 1) ? 1 : 0);
+            case "|" -> vm.push((firstOperand == 1) || (secondOperand == 1) ? 1 : 0);
+            default -> throw new UnsupportedOperationException("Unsupported operator.");
+        }
+    }
+
+    @Override
+    public String toString() {
+        return "BOP " + operator;
+    }
+}
diff --git a/interpreter/bytecodes/ByteCode.java b/interpreter/bytecodes/ByteCode.java
new file mode 100644
index 0000000..0f272df
--- /dev/null
+++ b/interpreter/bytecodes/ByteCode.java
@@ -0,0 +1,34 @@
+package interpreter.bytecodes;
+
+import interpreter.virtualmachine.VirtualMachine;
+
+public interface ByteCode {
+    void execute(VirtualMachine vm);
+
+    /**
+     * Static to be access without creating a ByteCode object (non-specified one).
+     * @param type the specific type of ByteCode, i.e., HaltCode.
+     * @param args the arguments passed through the ByteCode.
+     * @return an instantiated object of the specific type of ByteCode.
+     */
+    static ByteCode getInstance(String type, String[] args) {
+        return switch(type) {
+            case "HaltCode" -> new HaltCode();
+            case "PopCode" -> new PopCode(args);
+            case "FalseBranchCode" -> new FalseBranchCode(args);
+            case "GotoCode" -> new GotoCode(args);
+            case "StoreCode" -> new StoreCode(args);
+            case "LoadCode" -> new LoadCode(args);
+            case "LitCode" -> new LitCode(args);
+            case "ArgsCode" -> new ArgsCode(args);
+            case "CallCode" -> new CallCode(args);
+            case "ReturnCode" -> new ReturnCode(args);
+            case "BopCode" -> new BopCode(args);
+            case "ReadCode" -> new ReadCode();
+            case "WriteCode" -> new WriteCode();
+            case "LabelCode" -> new LabelCode(args);
+            case "VerboseCode" -> new VerboseCode(args);
+            default -> throw new IllegalArgumentException("Unexpected ByteCode type: " + type);
+        };
+    }
+}
diff --git a/interpreter/bytecodes/CallCode.java b/interpreter/bytecodes/CallCode.java
new file mode 100644
index 0000000..b518367
--- /dev/null
+++ b/interpreter/bytecodes/CallCode.java
@@ -0,0 +1,36 @@
+package interpreter.bytecodes;
+
+import interpreter.virtualmachine.VirtualMachine;
+
+public class CallCode implements ByteCode, Jumpable {
+    private String id;
+    private int resolvedAddress;
+    private String args;
+
+    public CallCode(String[] args) {
+        id = args[0];
+    }
+
+    //IMPORTANT: Saves return address and jumps to the function's location
+    @Override
+    public void execute(VirtualMachine vm) {
+        vm.addReturnAddress();
+        vm.jump(resolvedAddress);
+        args = vm.getFrameValues();
+    }
+
+    @Override
+    public void setAddress(int address) {
+        resolvedAddress = address;
+    }
+
+    @Override
+    public String toString() {
+        String base = "CALL " + id + "\t" + id.split("<<|>>")[0] + "(";
+        if (args != null) {
+            base += args;
+        }
+        base += ")";
+        return base;
+    }
+}
diff --git a/interpreter/bytecodes/FalseBranchCode.java b/interpreter/bytecodes/FalseBranchCode.java
new file mode 100644
index 0000000..0357bb0
--- /dev/null
+++ b/interpreter/bytecodes/FalseBranchCode.java
@@ -0,0 +1,32 @@
+package interpreter.bytecodes;
+
+import interpreter.virtualmachine.VirtualMachine;
+
+public class FalseBranchCode implements ByteCode, Jumpable {
+    private String label;
+    private int resolvedAddress; //int as it is the line number (stack position)
+
+    public FalseBranchCode(String[] args) {
+        label = args[0];
+    }
+
+    @Override
+    public void execute(VirtualMachine vm) {
+        if (vm.peek() == 0){ //If 0 jumps to label aka if-statement is true.
+            vm.pop(1);
+            vm.jump(resolvedAddress);
+        } else { //If not 0 then continue to next operation aka if-statement is false.
+            vm.pop(1);
+        }
+    }
+
+    @Override
+    public void setAddress(int address) {
+        resolvedAddress = address;
+    }
+
+    @Override
+    public String toString() {
+        return "FALSEBRANCH " + label;
+    }
+}
diff --git a/interpreter/bytecodes/GotoCode.java b/interpreter/bytecodes/GotoCode.java
new file mode 100644
index 0000000..ac2e091
--- /dev/null
+++ b/interpreter/bytecodes/GotoCode.java
@@ -0,0 +1,27 @@
+package interpreter.bytecodes;
+
+import interpreter.virtualmachine.VirtualMachine;
+
+public class GotoCode implements ByteCode, Jumpable {
+    private int resolvedAddress; //int as it is the line number (stack position)
+    private String label;
+
+    public GotoCode(String[] args) {
+        label = args[0];
+    }
+
+    @Override
+    public void execute(VirtualMachine vm) {
+        vm.jump(resolvedAddress);
+    }
+
+    @Override
+    public void setAddress(int address) {
+        resolvedAddress = address;
+    }
+
+    @Override
+    public String toString() {
+        return "GOTO " + label;
+    }
+}
diff --git a/interpreter/bytecodes/HaltCode.java b/interpreter/bytecodes/HaltCode.java
new file mode 100644
index 0000000..0d7eeea
--- /dev/null
+++ b/interpreter/bytecodes/HaltCode.java
@@ -0,0 +1,14 @@
+package interpreter.bytecodes;
+
+import interpreter.virtualmachine.VirtualMachine;
+
+public class HaltCode implements ByteCode {
+    public HaltCode() {
+        //Instantiate HaltCode but does nothing
+    }
+
+    @Override
+    public void execute(VirtualMachine vm) {
+        vm.stopRunning();
+    }
+}
diff --git a/interpreter/bytecodes/Jumpable.java b/interpreter/bytecodes/Jumpable.java
new file mode 100644
index 0000000..c1f87e1
--- /dev/null
+++ b/interpreter/bytecodes/Jumpable.java
@@ -0,0 +1,6 @@
+package interpreter.bytecodes;
+
+//Groups the Bytecode that jumps address
+public interface Jumpable {
+    void setAddress(int address);
+}
diff --git a/interpreter/bytecodes/LabelCode.java b/interpreter/bytecodes/LabelCode.java
new file mode 100644
index 0000000..e0abcb8
--- /dev/null
+++ b/interpreter/bytecodes/LabelCode.java
@@ -0,0 +1,21 @@
+package interpreter.bytecodes;
+
+import interpreter.virtualmachine.VirtualMachine;
+
+public class LabelCode implements ByteCode {
+    private String label;
+
+    public LabelCode(String[] args) {
+        label = args[0];
+    }
+
+    @Override
+    public void execute(VirtualMachine vm) {
+        //Does nothing but satisfy abstraction
+    }
+
+    @Override
+    public String toString() {
+        return "LABEL " + label;
+    }
+}
diff --git a/interpreter/bytecodes/LitCode.java b/interpreter/bytecodes/LitCode.java
new file mode 100644
index 0000000..f9f386b
--- /dev/null
+++ b/interpreter/bytecodes/LitCode.java
@@ -0,0 +1,30 @@
+package interpreter.bytecodes;
+
+import interpreter.virtualmachine.VirtualMachine;
+
+public class LitCode implements ByteCode {
+    private int value;
+    private String id; //The variable name
+
+    public LitCode(String[] args) {
+        value = Integer.parseInt(args[0]);
+
+        if (args.length > 1) {
+            id = args[1];
+        }
+    }
+
+    @Override
+    public void execute(VirtualMachine vm) {
+        vm.push(value);
+    }
+
+    @Override
+    public String toString() {
+        String base = "LIT " + value;
+        if (id != null) {
+            base += " " + id + "\tint " + id;
+        }
+        return base;
+    }
+}
\ No newline at end of file
diff --git a/interpreter/bytecodes/LoadCode.java b/interpreter/bytecodes/LoadCode.java
new file mode 100644
index 0000000..d68bb40
--- /dev/null
+++ b/interpreter/bytecodes/LoadCode.java
@@ -0,0 +1,30 @@
+package interpreter.bytecodes;
+
+import interpreter.virtualmachine.VirtualMachine;
+
+public class LoadCode implements ByteCode {
+    private int offSet;
+    private String id;
+
+    public LoadCode(String[] args) {
+        offSet = Integer.parseInt(args[0]);
+
+        if (args.length > 1) {
+            id = args[1];
+        }
+    }
+
+    @Override
+    public void execute(VirtualMachine vm) {
+        vm.load(offSet);
+    }
+
+    @Override
+    public String toString() {
+        String base = "LOAD " + offSet;
+        if (id != null) {
+            base += " " + id + "\t<load " + id + ">";
+        }
+        return base;
+    }
+}
diff --git a/interpreter/bytecodes/PopCode.java b/interpreter/bytecodes/PopCode.java
new file mode 100644
index 0000000..772bc2b
--- /dev/null
+++ b/interpreter/bytecodes/PopCode.java
@@ -0,0 +1,22 @@
+package interpreter.bytecodes;
+
+import interpreter.virtualmachine.VirtualMachine;
+
+public class PopCode implements ByteCode {
+    private int numOfPop;
+    private String executedPop;
+
+    public PopCode(String[] args) {
+        numOfPop = Integer.parseInt(args[0]);
+    }
+
+    @Override
+    public void execute(VirtualMachine vm) {
+        executedPop = Integer.toString(vm.pop(numOfPop));
+    }
+
+    @Override
+    public String toString() {
+        return "POP " + numOfPop;
+    }
+}
diff --git a/interpreter/bytecodes/ReadCode.java b/interpreter/bytecodes/ReadCode.java
new file mode 100644
index 0000000..412787d
--- /dev/null
+++ b/interpreter/bytecodes/ReadCode.java
@@ -0,0 +1,33 @@
+package interpreter.bytecodes;
+
+import interpreter.virtualmachine.VirtualMachine;
+
+import java.util.Scanner;
+
+public class ReadCode implements ByteCode {
+    public ReadCode() {
+        //Instantiate ReadCode but does nothing
+    }
+
+    @Override
+    public void execute(VirtualMachine vm) {
+        boolean isValid = false;
+
+        while (!isValid) {
+            Scanner input = new Scanner(System.in);
+            System.out.print("Please enter an integer: ");
+            try {
+                int value = input.nextInt();
+                isValid = true;
+                vm.push(value);
+            } catch (Exception e) {
+                System.out.println("Invalid Input!");
+            }
+        }
+    }
+
+    @Override
+    public String toString() {
+        return "READ";
+    }
+}
\ No newline at end of file
diff --git a/interpreter/bytecodes/ReturnCode.java b/interpreter/bytecodes/ReturnCode.java
new file mode 100644
index 0000000..76cf71a
--- /dev/null
+++ b/interpreter/bytecodes/ReturnCode.java
@@ -0,0 +1,38 @@
+package interpreter.bytecodes;
+
+import interpreter.virtualmachine.VirtualMachine;
+
+public class ReturnCode implements ByteCode, Jumpable {
+    private int resolvedAddress;
+    private String id;
+    private String value;
+
+    public ReturnCode(String[] args) {
+        if (args.length > 0) {
+            id = args[0];
+        }
+    }
+
+    @Override
+    public void execute(VirtualMachine vm) {
+        int returnValue = vm.peek();
+        vm.popFrame();
+        vm.push(returnValue);
+        vm.returnToOriginalAddress();
+        value = Integer.toString(vm.peek()); //For Verbose display
+    }
+
+    @Override
+    public void setAddress(int address) {
+        resolvedAddress = address;
+    }
+
+    @Override
+    public String toString() {
+        String base = "RETURN ";
+        if (id != null) {
+            base += id + "\t" + "EXIT " + id.split("<<|>>")[0] + " : " + value;
+        }
+        return base;
+    }
+}
\ No newline at end of file
diff --git a/interpreter/bytecodes/StoreCode.java b/interpreter/bytecodes/StoreCode.java
new file mode 100644
index 0000000..25f5819
--- /dev/null
+++ b/interpreter/bytecodes/StoreCode.java
@@ -0,0 +1,31 @@
+package interpreter.bytecodes;
+
+import interpreter.virtualmachine.VirtualMachine;
+
+public class StoreCode implements ByteCode {
+    private int offSet;
+    private String id;
+    private String storedValue;
+
+    public StoreCode(String[] args) {
+        offSet = Integer.parseInt(args[0]);
+
+        if (args.length > 1) {
+            id = args[1];
+        }
+    }
+
+    @Override
+    public void execute(VirtualMachine vm) {
+        storedValue = Integer.toString(vm.store(offSet));
+    }
+
+    @Override
+    public String toString() {
+        String base = "STORE " + offSet;
+        if (id != null) {
+            base += " " + id + "\t" + id + "=" + storedValue;
+        }
+        return base;
+    }
+}
diff --git a/interpreter/bytecodes/VerboseCode.java b/interpreter/bytecodes/VerboseCode.java
new file mode 100644
index 0000000..7d93ed8
--- /dev/null
+++ b/interpreter/bytecodes/VerboseCode.java
@@ -0,0 +1,21 @@
+package interpreter.bytecodes;
+
+import interpreter.virtualmachine.VirtualMachine;
+
+public class VerboseCode implements ByteCode {
+    private String enabled;
+
+    public VerboseCode(String[] args) {
+        enabled = args[0];
+    }
+
+    @Override
+    public void execute(VirtualMachine vm) {
+        vm.toggleVerbose(enabled);
+    }
+
+    @Override
+    public String toString() {
+        return "VERBOSE " + enabled;
+    }
+}
\ No newline at end of file
diff --git a/interpreter/bytecodes/WriteCode.java b/interpreter/bytecodes/WriteCode.java
new file mode 100644
index 0000000..4839458
--- /dev/null
+++ b/interpreter/bytecodes/WriteCode.java
@@ -0,0 +1,19 @@
+package interpreter.bytecodes;
+
+import interpreter.virtualmachine.VirtualMachine;
+
+public class WriteCode implements ByteCode {
+    public WriteCode() {
+        //Instantiate WriteCode but does nothing
+    }
+
+    @Override
+    public void execute(VirtualMachine vm) {
+        System.out.println(vm.peek());
+    }
+
+    @Override
+    public String toString() {
+        return "WRITE";
+    }
+}
\ No newline at end of file
diff --git a/interpreter/loaders/ByteCodeLoader.java b/interpreter/loaders/ByteCodeLoader.java
index add318f..298f47e 100644
--- a/interpreter/loaders/ByteCodeLoader.java
+++ b/interpreter/loaders/ByteCodeLoader.java
@@ -1,6 +1,10 @@
 package interpreter.loaders;
 
-import interpreter.loaders.Program;
+import interpreter.bytecodes.ByteCode;
+
+import java.io.File;
+import java.io.FileNotFoundException;
+import java.util.Scanner;
 
 public final class ByteCodeLoader {
     private String codSourceFileName;
@@ -21,6 +25,25 @@ public final class ByteCodeLoader {
      * loadCodes fails.
      */
     public Program loadCodes() throws InvalidProgramException {
-       return null;
+        File myFile = new File(codSourceFileName);
+        Program program = new Program();
+
+        try (Scanner myReader = new Scanner(myFile)) {
+            while (myReader.hasNextLine()) {
+                String line = myReader.nextLine();
+                String[] parts = line.split("\\s+");
+
+                String byteCodeName = CodeTable.getClassName(parts[0]);
+                String[] args = new String[parts.length - 1];
+                System.arraycopy(parts, 1, args, 0, args.length);
+
+                ByteCode BC = ByteCode.getInstance(byteCodeName, args);
+                program.addCode(BC);
+            }
+        } catch (FileNotFoundException e) {
+            throw new RuntimeException("File not found: " + codSourceFileName, e);
+        }
+
+        return program;
     }
 }
diff --git a/interpreter/loaders/CodeTable.java b/interpreter/loaders/CodeTable.java
index 4b2d000..381414e 100644
--- a/interpreter/loaders/CodeTable.java
+++ b/interpreter/loaders/CodeTable.java
@@ -5,7 +5,11 @@
  */
 package interpreter.loaders;
 
+import java.util.Map;
+import java.util.HashMap;
+
 public final class CodeTable {
+   private static final Map<String, String> ByteCodes = new HashMap<>();
 
    private CodeTable() {
       // do nothing
@@ -15,17 +19,30 @@ public final class CodeTable {
     * fill code table with class name mappings
     */
    public static void init() {
-
+      ByteCodes.put("HALT", "HaltCode");
+      ByteCodes.put("POP", "PopCode");
+      ByteCodes.put("FALSEBRANCH", "FalseBranchCode");
+      ByteCodes.put("GOTO", "GotoCode");
+      ByteCodes.put("STORE", "StoreCode");
+      ByteCodes.put("LOAD", "LoadCode");
+      ByteCodes.put("LIT", "LitCode");
+      ByteCodes.put("ARGS", "ArgsCode");
+      ByteCodes.put("CALL", "CallCode");
+      ByteCodes.put("RETURN", "ReturnCode");
+      ByteCodes.put("BOP", "BopCode");
+      ByteCodes.put("READ", "ReadCode");
+      ByteCodes.put("WRITE", "WriteCode");
+      ByteCodes.put("LABEL", "LabelCode");
+      ByteCodes.put("VERBOSE", "VerboseCode");
    }
 
    /**
     * Returns the ByteCode class name for a given token.
-    * 
     * @param token bytecode to map. For example, HALT --> HaltCode
     * @return class name of bytecode
     */
    public static String getClassName(String token) {
-      return null;
+      return ByteCodes.get(token);
    }
 
 }
diff --git a/interpreter/loaders/Program.java b/interpreter/loaders/Program.java
index ad09e34..56894a9 100644
--- a/interpreter/loaders/Program.java
+++ b/interpreter/loaders/Program.java
@@ -1,7 +1,14 @@
 package interpreter.loaders;
 
+import interpreter.bytecodes.ByteCode;
+import interpreter.bytecodes.Jumpable;
+import interpreter.bytecodes.*; //remove later
+import interpreter.virtualmachine.VirtualMachine;
+
 import java.util.ArrayList;
 import java.util.List;
+import java.util.HashMap;
+
 public class Program {
 
     private List<ByteCode> program;
@@ -11,7 +18,7 @@ public class Program {
      * ArrayList
      */
     public Program() {
-
+        this.program = new ArrayList<>();
     }
 
     /**
@@ -19,7 +26,7 @@ public class Program {
      * @return size of program
      */
     public int getSize() {
-        return 0;
+        return program.size();
     }
 
     /**
@@ -28,7 +35,7 @@ public class Program {
      * @return a bytecode.
      */
     public ByteCode getCode(int programCounter) {
-        return null;
+        return program.get(programCounter);
     }
 
     /**
@@ -36,12 +43,12 @@ public class Program {
      * @param c bytecode to be added
      */
     public void addCode(ByteCode c) {
-
+        program.add(c);
     }
 
     /**
      * Makes multiple passes through the program ArrayList
-     * resolving addrss for Goto,Call and FalseBranch
+     * resolving address for Goto,Call and FalseBranch
      * bytecodes. These bytecodes can only jump to Label
      * codes that have a matching label value.
      * HINT: make note of what type of data-structure
@@ -49,6 +56,29 @@ public class Program {
      * **** METHOD SIGNATURE CANNOT BE CHANGED *****
      */
     public void resolveAddress() {
+        HashMap<String, Integer> labelAddress = new HashMap<>();
+        VirtualMachine vm = new VirtualMachine(this);
+
+        int index = 0;
+        //Assign the appropriate index to the label Bytecodes
+        for (ByteCode c : program) {
+            if (c instanceof LabelCode) {
+                String label = vm.getLabel(c.toString());
+                labelAddress.put(label, index);
+            }
+            index++;
+        }
 
+        //Resolve the address of the ByteCodes that jumps. Assigns the index to label.
+        for (ByteCode c : program) {
+            if (c instanceof Jumpable) {
+                String label = vm.getLabel(c.toString());
+                if (label != null) {
+                    int address = labelAddress.get(label);
+                    Jumpable bytecode = (Jumpable) c;
+                    bytecode.setAddress(address);
+                }
+            }
+        }
     }
 }   
\ No newline at end of file
diff --git a/interpreter/virtualmachine/RunTimeStack.java b/interpreter/virtualmachine/RunTimeStack.java
index 3289bc0..4be5ac4 100644
--- a/interpreter/virtualmachine/RunTimeStack.java
+++ b/interpreter/virtualmachine/RunTimeStack.java
@@ -1,6 +1,7 @@
 package interpreter.virtualmachine;
 
 import java.util.ArrayList;
+import java.util.EmptyStackException;
 import java.util.List;
 import java.util.Stack;
 
@@ -17,4 +18,160 @@ class RunTimeStack {
         framePointer.add(0);
     }
 
+    /**
+     * Used for displaying the current state of the runTimeStack .
+     * It will print portions of the stack based on respective
+     * frame markers .
+     * Example [1 ,2 ,3] [4 ,5 ,6] [7 ,8]
+     * Frame pointers would be 0 ,3 ,6
+     */
+    public String verboseDisplay() {
+        StringBuilder result = new StringBuilder();
+        int numOfFrames = framePointer.size();
+
+        for (int i = 0; i < numOfFrames; i++) {
+            int start = framePointer.get(i);
+            //Calculate end index of the frame. Accounts for n+1.
+            int end = (i + 1 < numOfFrames) ? framePointer.get(i + 1) : runTimeStack.size();
+
+            //Create string for seperated frames
+            result.append("[");
+            for (int j = start; j < end; j++) {
+                result.append(runTimeStack.get(j));
+                if (j < end - 1) {
+                    result.append(", ");
+                }
+            }
+            result.append("]");
+
+            //Add space between frames
+            if (i < numOfFrames - 1) {
+                result.append(" ");
+            }
+        }
+
+        return result.toString();
+    }
+
+    /**
+     * returns the top of the runtime stack, but does not remove
+     * @return copy of the top of the stack .
+     */
+    public int peek() {
+        if (runTimeStack.isEmpty()) {
+            throw new EmptyStackException();
+        }
+        return runTimeStack.getLast();
+    }
+
+    /**
+     * removes to the top of the runtime stack.
+     * @return the value popped.
+     */
+    public int push(int value) {
+        runTimeStack.add(value);
+        return value;
+    }
+
+    /**
+     * removes to the top of the runtime stack.
+     * @return the value popped.
+     */
+    public int pop() {
+        if (runTimeStack.isEmpty()) {
+            throw new EmptyStackException();
+        }
+        return runTimeStack.removeLast();
+    }
+
+    /**
+     * Takes the top item of the run time stack, and stores
+     * it into an offset starting from the current frame .
+     * @param offsetInFrame number of slots above current frame marker
+     * @return the item just stored
+     */
+    public int store(int offsetInFrame) {
+        if (runTimeStack.isEmpty() || framePointer.isEmpty()) {
+            throw new EmptyStackException();
+        }
+
+        int value = this.pop();
+        runTimeStack.set(framePointer.peek() + offsetInFrame, value);
+        return value;
+    }
+
+    /**
+     * Takes a value from the run time stack that is at offset
+     * from the current frame marker and pushes it onto the top of the stack .
+     * @param offsetInFrame number of slots above current frame marker
+     * @return item just loaded into the offset
+     */
+    public int load(int offsetInFrame) {
+        if (framePointer.isEmpty() || framePointer.peek() + offsetInFrame >= runTimeStack.size()) {
+            throw new IndexOutOfBoundsException("Invalid offset in frame.");
+        }
+        return this.push(runTimeStack.get(offsetInFrame + framePointer.peek()));
+    }
+
+    /**
+     * create a new frame pointer at the index offset slots down
+     * from the top of the runtime stack.
+     * @param offsetFromTopOfRunStack slots down from the top ot the runtime stack
+     */
+    public void newFrameAt(int offsetFromTopOfRunStack) {
+        if (offsetFromTopOfRunStack > runTimeStack.size()) {
+            throw new IndexOutOfBoundsException("Offset is greater than the size of the runtime stack.");
+        }
+        framePointer.push(runTimeStack.size() - offsetFromTopOfRunStack);
+    }
+
+    /**
+     * pop the current frame off the runtime stack . Also removes
+     * the frame pointer value from the FramePointer Stack .
+     */
+    public void popFrame() {
+        if (framePointer.isEmpty()) {
+            throw new EmptyStackException();
+        }
+
+        int frameStart = framePointer.pop();
+        while (runTimeStack.size() > frameStart) {
+            this.pop();
+        }
+    }
+
+    /**
+     * Get the current frame size for pop
+     * @return the current frame size
+     */
+    public int getCurrentFrameSize() {
+        return runTimeStack.size() - framePointer.peek();
+    }
+
+    /**
+     * Get the current frame pointer. Enforce encapsulation for vm.
+     * @return the current frame pointer.
+     */
+    public int framePeek() {
+        return framePointer.peek();
+    }
+
+    /**
+     * Get the size of runTimeStack. Enforce encapsulation for vm.
+     * @return the runTimeStack size.
+     */
+    public int rtsSize() {
+        return runTimeStack.size();
+    }
+
+//    public static void main(String[] args) {
+//        RunTimeStack rts = new RunTimeStack();
+//        rts.push(1); rts.push(2); rts.push(3);
+//        rts.push(4); rts.push(5); rts.push(6); rts.newFrameAt(3);
+//        rts.push(7); rts.push(8); rts.newFrameAt(2);
+//
+//        rts.popFrame();
+//        System.out.println(rts.verboseDisplay());
+//        System.out.println(rts.getCurrentFrameSize());
+//    }
 }
diff --git a/interpreter/virtualmachine/VirtualMachine.java b/interpreter/virtualmachine/VirtualMachine.java
index 5d7be36..3db4b80 100644
--- a/interpreter/virtualmachine/VirtualMachine.java
+++ b/interpreter/virtualmachine/VirtualMachine.java
@@ -1,15 +1,19 @@
 package interpreter.virtualmachine;
 
 import java.util.Stack;
+
+import interpreter.bytecodes.ByteCode;
+import interpreter.bytecodes.HaltCode;
 import interpreter.loaders.Program;
 
 public class VirtualMachine {
 
-    private RunTimeStack   runTimeStack;
+    private RunTimeStack runTimeStack;
     private Stack<Integer> returnAddress;
-    private Program        program;
-    private int            programCounter;
-    private boolean        isRunning;
+    private Program program;
+    private int programCounter;
+    private boolean isRunning;
+    private boolean verboseEnabled;
 
     public VirtualMachine(Program program) {
         this.program = program;
@@ -17,4 +21,152 @@ public class VirtualMachine {
         this.returnAddress = new Stack<>();
         this.programCounter = 0;
     }
+
+    public void executeProgram() {
+        isRunning = true;
+
+        while (isRunning) {
+            ByteCode code = program.getCode(programCounter);
+            code.execute(this);
+            if (verboseEnabled && !(code instanceof HaltCode)) {
+                System.out.println(code);
+                System.out.println(runTimeStack.verboseDisplay());
+            }
+            programCounter++;
+        }
+    }
+
+    //Stops the .cod program from executing
+    public void stopRunning() {
+        isRunning = false;
+    }
+
+    /**
+     * Removes a number of elements from Runtime stack.
+     * @param numOfPop number of elements to remove from Runtime stack.
+     */
+    public int pop(int numOfPop) {
+        int amountToPop = numOfPop;
+        int poppedValue = 0;
+
+        if (numOfPop > runTimeStack.getCurrentFrameSize()) {
+            amountToPop = runTimeStack.getCurrentFrameSize();
+        }
+
+        for (int i = 0; i < amountToPop; i++) {
+            poppedValue = runTimeStack.pop();
+        }
+
+        return poppedValue;
+    }
+
+    /**
+     * Jumps to a location in the .cod program stack.
+     * @param jumpAddress the location to jump to. In other words, the line number (stack position).
+     */
+    public void jump(int jumpAddress) {
+        programCounter = jumpAddress; //maybe fix the (stack position) comment.
+    }
+
+    /**
+     * Open store function access to StoreCode.
+     * @param offSet the offset from the beginning of the frame.
+     */
+    public int store(int offSet) {
+        int storedValue = 0;
+        if (runTimeStack.framePeek() != runTimeStack.rtsSize()) {
+            storedValue = runTimeStack.store(offSet);
+        }
+        return storedValue;
+    }
+
+    /**
+     * Open load function access to StoreCode.
+     * @param offSet the offset from the beginning of the frame.
+     */
+    public void load(int offSet) {
+        runTimeStack.load(offSet);
+    }
+
+    /**
+     * Push a value to runTimeStack.
+     * @param value to be pushed to the stack.
+     */
+    public void push(int value) {
+        runTimeStack.push(value);
+    }
+
+    /**
+     * Entry point for ArgsCode to access runTimeStack's newFrameAt.
+     * @param offSetFromTop the offset down from the top of the stack.
+     */
+    public void newFrameAt(int offSetFromTop) {
+        runTimeStack.newFrameAt(offSetFromTop);
+    }
+
+    /**
+     * Prompts vm to push current programCounter (can be viewed as the code line)
+     * into the returnAddress stack.
+     */
+    public void addReturnAddress() {
+        returnAddress.push(programCounter);
+    }
+
+    /**
+     * Allow ByteCode access to runTimeStack peek.
+     * @return the top of the runtime stack.
+     */
+    public int peek() {
+        return runTimeStack.peek();
+    }
+
+    /**
+     * Allow ByteCode access to runTimeStack popFrame function.
+     */
+    public void popFrame() {
+        runTimeStack.popFrame();
+    }
+
+    /**
+     * Returns the program back to the stored return address.
+     */
+    public void returnToOriginalAddress() {
+        programCounter = returnAddress.pop();
+    }
+
+    /**
+     * Toggles verbose mode.
+     * @param mode determines if verbose is enabled or not.
+     */
+    public void toggleVerbose(String mode) {
+        if (mode.equals("ON")) {
+            verboseEnabled = true;
+        }
+        if (mode.equals("OFF")) {
+            verboseEnabled = false;
+        }
+    }
+
+    /**
+     * Parse the code's line and seperates the label
+     * from the Bytecode.
+     * @param byteCode the ByteCode string (the line of code).
+     * @return the seperated label.
+     */
+    public String getLabel(String byteCode) {
+        String[] parseByteCode = byteCode.split("\\s+");
+        if (parseByteCode.length > 1) {
+            return parseByteCode[1];
+        }
+        return null;
+    }
+
+    /**
+     * Gets the values of the top frame.
+     * @return the values of the top frame.
+     */
+    public String getFrameValues() {
+        String[] frames = runTimeStack.verboseDisplay().split("[\\[\\]]");
+        return frames[frames.length - 1];
+    }
 }

~~~

</details>




## Compiling Source Code Results: 



~~~bash

~~~
    


## Code Review


<details>
    <summary>./interpreter/Interpreter.java</summary>

~~~java
package interpreter;

import interpreter.loaders.ByteCodeLoader;
import interpreter.loaders.CodeTable;
import interpreter.loaders.InvalidProgramException;
import interpreter.loaders.Program;
import interpreter.virtualmachine.VirtualMachine;

/**
 * <pre>
 *     Interpreter class runs the interpreter:
 *     1. Perform all initializations
 *     2. Load the ByteCodes from file
 *     3. Run the virtual machine
 * 
 *     THIS FILE CANNOT BE MODIFIED. DO NOT
 *     LET ANY EXCEPTIONS REACH THE
 * 
 * </pre>
 */
public class Interpreter {

    private ByteCodeLoader byteCodeLoader;

    public Interpreter(String codeFile) {
        byteCodeLoader = new ByteCodeLoader(codeFile);
    }

    void run() {
        CodeTable.init();
        Program program = null;
        try{
            program = byteCodeLoader.loadCodes();
        } catch(InvalidProgramException ex){
            System.out.println(ex);
            ex.printStackTrace();
            System.exit(-2);
        }
        program.resolveAddress();
        VirtualMachine virtualMachine = new VirtualMachine(program);
        virtualMachine.executeProgram();
    }

    public static void main(String args[]) {

        if (args.length == 0) {
            System.out.println("***Incorrect usage, try: java interpreter.Interpreter <file>");
            System.exit(1);
        }
        (new Interpreter(args[0])).run();
    }
}
~~~

</details>



<details>
    <summary>./interpreter/virtualmachine/VirtualMachine.java</summary>

~~~java
package interpreter.virtualmachine;

import java.util.Stack;

import interpreter.bytecodes.ByteCode;
import interpreter.bytecodes.HaltCode;
import interpreter.loaders.Program;

public class VirtualMachine {

    private RunTimeStack runTimeStack;
    private Stack<Integer> returnAddress;
    private Program program;
    private int programCounter;
    private boolean isRunning;
    private boolean verboseEnabled;

    public VirtualMachine(Program program) {
        this.program = program;
        this.runTimeStack = new RunTimeStack();
        this.returnAddress = new Stack<>();
        this.programCounter = 0;
    }

    public void executeProgram() {
        isRunning = true;

        while (isRunning) {
            ByteCode code = program.getCode(programCounter);
            code.execute(this);
            if (verboseEnabled && !(code instanceof HaltCode)) {
                System.out.println(code);
                System.out.println(runTimeStack.verboseDisplay());
            }
            programCounter++;
        }
    }

    //Stops the .cod program from executing
    public void stopRunning() {
        isRunning = false;
    }

    /**
     * Removes a number of elements from Runtime stack.
     * @param numOfPop number of elements to remove from Runtime stack.
     */
    public int pop(int numOfPop) {
        int amountToPop = numOfPop;
        int poppedValue = 0;

        if (numOfPop > runTimeStack.getCurrentFrameSize()) {
            amountToPop = runTimeStack.getCurrentFrameSize();
        }

        for (int i = 0; i < amountToPop; i++) {
            poppedValue = runTimeStack.pop();
        }

        return poppedValue;
    }

    /**
     * Jumps to a location in the .cod program stack.
     * @param jumpAddress the location to jump to. In other words, the line number (stack position).
     */
    public void jump(int jumpAddress) {
        programCounter = jumpAddress; //maybe fix the (stack position) comment.
    }

    /**
     * Open store function access to StoreCode.
     * @param offSet the offset from the beginning of the frame.
     */
    public int store(int offSet) {
        int storedValue = 0;
        if (runTimeStack.framePeek() != runTimeStack.rtsSize()) {
            storedValue = runTimeStack.store(offSet);
        }
        return storedValue;
    }

    /**
     * Open load function access to StoreCode.
     * @param offSet the offset from the beginning of the frame.
     */
    public void load(int offSet) {
        runTimeStack.load(offSet);
    }

    /**
     * Push a value to runTimeStack.
     * @param value to be pushed to the stack.
     */
    public void push(int value) {
        runTimeStack.push(value);
    }

    /**
     * Entry point for ArgsCode to access runTimeStack's newFrameAt.
     * @param offSetFromTop the offset down from the top of the stack.
     */
    public void newFrameAt(int offSetFromTop) {
        runTimeStack.newFrameAt(offSetFromTop);
    }

    /**
     * Prompts vm to push current programCounter (can be viewed as the code line)
     * into the returnAddress stack.
     */
    public void addReturnAddress() {
        returnAddress.push(programCounter);
    }

    /**
     * Allow ByteCode access to runTimeStack peek.
     * @return the top of the runtime stack.
     */
    public int peek() {
        return runTimeStack.peek();
    }

    /**
     * Allow ByteCode access to runTimeStack popFrame function.
     */
    public void popFrame() {
        runTimeStack.popFrame();
    }

    /**
     * Returns the program back to the stored return address.
     */
    public void returnToOriginalAddress() {
        programCounter = returnAddress.pop();
    }

    /**
     * Toggles verbose mode.
     * @param mode determines if verbose is enabled or not.
     */
    public void toggleVerbose(String mode) {
        if (mode.equals("ON")) {
            verboseEnabled = true;
        }
        if (mode.equals("OFF")) {
            verboseEnabled = false;
        }
    }

    /**
     * Parse the code's line and seperates the label
     * from the Bytecode.
     * @param byteCode the ByteCode string (the line of code).
     * @return the seperated label.
     */
    public String getLabel(String byteCode) {
        String[] parseByteCode = byteCode.split("\\s+");
        if (parseByteCode.length > 1) {
            return parseByteCode[1];
        }
        return null;
    }

    /**
     * Gets the values of the top frame.
     * @return the values of the top frame.
     */
    public String getFrameValues() {
        String[] frames = runTimeStack.verboseDisplay().split("[\\[\\]]");
        return frames[frames.length - 1];
    }
}

~~~

</details>



<details>
    <summary>./interpreter/virtualmachine/RunTimeStack.java</summary>

~~~java
package interpreter.virtualmachine;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

class RunTimeStack {

    private List<Integer> runTimeStack;
    private Stack<Integer> framePointer;

    public RunTimeStack() {
        runTimeStack = new ArrayList<>();
        framePointer = new Stack<>();
        // Add initial frame pointer value, main is the entry
        // point of our language, so its frame pointer is 0.
        framePointer.add(0);
    }

    /**
     * Used for displaying the current state of the runTimeStack .
     * It will print portions of the stack based on respective
     * frame markers .
     * Example [1 ,2 ,3] [4 ,5 ,6] [7 ,8]
     * Frame pointers would be 0 ,3 ,6
     */
    public String verboseDisplay() {
        StringBuilder result = new StringBuilder();
        int numOfFrames = framePointer.size();

        for (int i = 0; i < numOfFrames; i++) {
            int start = framePointer.get(i);
            //Calculate end index of the frame. Accounts for n+1.
            int end = (i + 1 < numOfFrames) ? framePointer.get(i + 1) : runTimeStack.size();

            //Create string for seperated frames
            result.append("[");
            for (int j = start; j < end; j++) {
                result.append(runTimeStack.get(j));
                if (j < end - 1) {
                    result.append(", ");
                }
            }
            result.append("]");

            //Add space between frames
            if (i < numOfFrames - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    /**
     * returns the top of the runtime stack, but does not remove
     * @return copy of the top of the stack .
     */
    public int peek() {
        if (runTimeStack.isEmpty()) {
            throw new EmptyStackException();
        }
        return runTimeStack.getLast();
    }

    /**
     * removes to the top of the runtime stack.
     * @return the value popped.
     */
    public int push(int value) {
        runTimeStack.add(value);
        return value;
    }

    /**
     * removes to the top of the runtime stack.
     * @return the value popped.
     */
    public int pop() {
        if (runTimeStack.isEmpty()) {
            throw new EmptyStackException();
        }
        return runTimeStack.removeLast();
    }

    /**
     * Takes the top item of the run time stack, and stores
     * it into an offset starting from the current frame .
     * @param offsetInFrame number of slots above current frame marker
     * @return the item just stored
     */
    public int store(int offsetInFrame) {
        if (runTimeStack.isEmpty() || framePointer.isEmpty()) {
            throw new EmptyStackException();
        }

        int value = this.pop();
        runTimeStack.set(framePointer.peek() + offsetInFrame, value);
        return value;
    }

    /**
     * Takes a value from the run time stack that is at offset
     * from the current frame marker and pushes it onto the top of the stack .
     * @param offsetInFrame number of slots above current frame marker
     * @return item just loaded into the offset
     */
    public int load(int offsetInFrame) {
        if (framePointer.isEmpty() || framePointer.peek() + offsetInFrame >= runTimeStack.size()) {
            throw new IndexOutOfBoundsException("Invalid offset in frame.");
        }
        return this.push(runTimeStack.get(offsetInFrame + framePointer.peek()));
    }

    /**
     * create a new frame pointer at the index offset slots down
     * from the top of the runtime stack.
     * @param offsetFromTopOfRunStack slots down from the top ot the runtime stack
     */
    public void newFrameAt(int offsetFromTopOfRunStack) {
        if (offsetFromTopOfRunStack > runTimeStack.size()) {
            throw new IndexOutOfBoundsException("Offset is greater than the size of the runtime stack.");
        }
        framePointer.push(runTimeStack.size() - offsetFromTopOfRunStack);
    }

    /**
     * pop the current frame off the runtime stack . Also removes
     * the frame pointer value from the FramePointer Stack .
     */
    public void popFrame() {
        if (framePointer.isEmpty()) {
            throw new EmptyStackException();
        }

        int frameStart = framePointer.pop();
        while (runTimeStack.size() > frameStart) {
            this.pop();
        }
    }

    /**
     * Get the current frame size for pop
     * @return the current frame size
     */
    public int getCurrentFrameSize() {
        return runTimeStack.size() - framePointer.peek();
    }

    /**
     * Get the current frame pointer. Enforce encapsulation for vm.
     * @return the current frame pointer.
     */
    public int framePeek() {
        return framePointer.peek();
    }

    /**
     * Get the size of runTimeStack. Enforce encapsulation for vm.
     * @return the runTimeStack size.
     */
    public int rtsSize() {
        return runTimeStack.size();
    }

//    public static void main(String[] args) {
//        RunTimeStack rts = new RunTimeStack();
//        rts.push(1); rts.push(2); rts.push(3);
//        rts.push(4); rts.push(5); rts.push(6); rts.newFrameAt(3);
//        rts.push(7); rts.push(8); rts.newFrameAt(2);
//
//        rts.popFrame();
//        System.out.println(rts.verboseDisplay());
//        System.out.println(rts.getCurrentFrameSize());
//    }
}

~~~

</details>



<details>
    <summary>./interpreter/bytecodes/ByteCode.java</summary>

~~~java
package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public interface ByteCode {
    void execute(VirtualMachine vm);

    /**
     * Static to be access without creating a ByteCode object (non-specified one).
     * @param type the specific type of ByteCode, i.e., HaltCode.
     * @param args the arguments passed through the ByteCode.
     * @return an instantiated object of the specific type of ByteCode.
     */
    static ByteCode getInstance(String type, String[] args) {
        return switch(type) {
            case "HaltCode" -> new HaltCode();
            case "PopCode" -> new PopCode(args);
            case "FalseBranchCode" -> new FalseBranchCode(args);
            case "GotoCode" -> new GotoCode(args);
            case "StoreCode" -> new StoreCode(args);
            case "LoadCode" -> new LoadCode(args);
            case "LitCode" -> new LitCode(args);
            case "ArgsCode" -> new ArgsCode(args);
            case "CallCode" -> new CallCode(args);
            case "ReturnCode" -> new ReturnCode(args);
            case "BopCode" -> new BopCode(args);
            case "ReadCode" -> new ReadCode();
            case "WriteCode" -> new WriteCode();
            case "LabelCode" -> new LabelCode(args);
            case "VerboseCode" -> new VerboseCode(args);
            default -> throw new IllegalArgumentException("Unexpected ByteCode type: " + type);
        };
    }
}

~~~

</details>



<details>
    <summary>./interpreter/bytecodes/HaltCode.java</summary>

~~~java
package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class HaltCode implements ByteCode {
    public HaltCode() {
        //Instantiate HaltCode but does nothing
    }

    @Override
    public void execute(VirtualMachine vm) {
        vm.stopRunning();
    }
}

~~~

</details>



<details>
    <summary>./interpreter/bytecodes/LoadCode.java</summary>

~~~java
package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class LoadCode implements ByteCode {
    private int offSet;
    private String id;

    public LoadCode(String[] args) {
        offSet = Integer.parseInt(args[0]);

        if (args.length > 1) {
            id = args[1];
        }
    }

    @Override
    public void execute(VirtualMachine vm) {
        vm.load(offSet);
    }

    @Override
    public String toString() {
        String base = "LOAD " + offSet;
        if (id != null) {
            base += " " + id + "\t<load " + id + ">";
        }
        return base;
    }
}

~~~

</details>



<details>
    <summary>./interpreter/bytecodes/VerboseCode.java</summary>

~~~java
package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class VerboseCode implements ByteCode {
    private String enabled;

    public VerboseCode(String[] args) {
        enabled = args[0];
    }

    @Override
    public void execute(VirtualMachine vm) {
        vm.toggleVerbose(enabled);
    }

    @Override
    public String toString() {
        return "VERBOSE " + enabled;
    }
}
~~~

</details>



<details>
    <summary>./interpreter/bytecodes/Jumpable.java</summary>

~~~java
package interpreter.bytecodes;

//Groups the Bytecode that jumps address
public interface Jumpable {
    void setAddress(int address);
}

~~~

</details>



<details>
    <summary>./interpreter/bytecodes/ReturnCode.java</summary>

~~~java
package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class ReturnCode implements ByteCode, Jumpable {
    private int resolvedAddress;
    private String id;
    private String value;

    public ReturnCode(String[] args) {
        if (args.length > 0) {
            id = args[0];
        }
    }

    @Override
    public void execute(VirtualMachine vm) {
        int returnValue = vm.peek();
        vm.popFrame();
        vm.push(returnValue);
        vm.returnToOriginalAddress();
        value = Integer.toString(vm.peek()); //For Verbose display
    }

    @Override
    public void setAddress(int address) {
        resolvedAddress = address;
    }

    @Override
    public String toString() {
        String base = "RETURN ";
        if (id != null) {
            base += id + "\t" + "EXIT " + id.split("<<|>>")[0] + " : " + value;
        }
        return base;
    }
}
~~~

</details>



<details>
    <summary>./interpreter/bytecodes/LitCode.java</summary>

~~~java
package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class LitCode implements ByteCode {
    private int value;
    private String id; //The variable name

    public LitCode(String[] args) {
        value = Integer.parseInt(args[0]);

        if (args.length > 1) {
            id = args[1];
        }
    }

    @Override
    public void execute(VirtualMachine vm) {
        vm.push(value);
    }

    @Override
    public String toString() {
        String base = "LIT " + value;
        if (id != null) {
            base += " " + id + "\tint " + id;
        }
        return base;
    }
}
~~~

</details>



<details>
    <summary>./interpreter/bytecodes/FalseBranchCode.java</summary>

~~~java
package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class FalseBranchCode implements ByteCode, Jumpable {
    private String label;
    private int resolvedAddress; //int as it is the line number (stack position)

    public FalseBranchCode(String[] args) {
        label = args[0];
    }

    @Override
    public void execute(VirtualMachine vm) {
        if (vm.peek() == 0){ //If 0 jumps to label aka if-statement is true.
            vm.pop(1);
            vm.jump(resolvedAddress);
        } else { //If not 0 then continue to next operation aka if-statement is false.
            vm.pop(1);
        }
    }

    @Override
    public void setAddress(int address) {
        resolvedAddress = address;
    }

    @Override
    public String toString() {
        return "FALSEBRANCH " + label;
    }
}

~~~

</details>



<details>
    <summary>./interpreter/bytecodes/ArgsCode.java</summary>

~~~java
package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class ArgsCode implements ByteCode {
    private int offSetFromTop;

    public ArgsCode(String[] args) {
        offSetFromTop = Integer.parseInt(args[0]);
    }

    @Override
    public void execute(VirtualMachine vm) {
        vm.newFrameAt(offSetFromTop);
    }

    @Override
    public String toString() {
        return "ARGS " + offSetFromTop;
    }
}
~~~

</details>



<details>
    <summary>./interpreter/bytecodes/StoreCode.java</summary>

~~~java
package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class StoreCode implements ByteCode {
    private int offSet;
    private String id;
    private String storedValue;

    public StoreCode(String[] args) {
        offSet = Integer.parseInt(args[0]);

        if (args.length > 1) {
            id = args[1];
        }
    }

    @Override
    public void execute(VirtualMachine vm) {
        storedValue = Integer.toString(vm.store(offSet));
    }

    @Override
    public String toString() {
        String base = "STORE " + offSet;
        if (id != null) {
            base += " " + id + "\t" + id + "=" + storedValue;
        }
        return base;
    }
}

~~~

</details>



<details>
    <summary>./interpreter/bytecodes/LabelCode.java</summary>

~~~java
package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class LabelCode implements ByteCode {
    private String label;

    public LabelCode(String[] args) {
        label = args[0];
    }

    @Override
    public void execute(VirtualMachine vm) {
        //Does nothing but satisfy abstraction
    }

    @Override
    public String toString() {
        return "LABEL " + label;
    }
}

~~~

</details>



<details>
    <summary>./interpreter/bytecodes/ReadCode.java</summary>

~~~java
package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

import java.util.Scanner;

public class ReadCode implements ByteCode {
    public ReadCode() {
        //Instantiate ReadCode but does nothing
    }

    @Override
    public void execute(VirtualMachine vm) {
        boolean isValid = false;

        while (!isValid) {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter an integer: ");
            try {
                int value = input.nextInt();
                isValid = true;
                vm.push(value);
            } catch (Exception e) {
                System.out.println("Invalid Input!");
            }
        }
    }

    @Override
    public String toString() {
        return "READ";
    }
}
~~~

</details>



<details>
    <summary>./interpreter/bytecodes/PopCode.java</summary>

~~~java
package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class PopCode implements ByteCode {
    private int numOfPop;
    private String executedPop;

    public PopCode(String[] args) {
        numOfPop = Integer.parseInt(args[0]);
    }

    @Override
    public void execute(VirtualMachine vm) {
        executedPop = Integer.toString(vm.pop(numOfPop));
    }

    @Override
    public String toString() {
        return "POP " + numOfPop;
    }
}

~~~

</details>



<details>
    <summary>./interpreter/bytecodes/CallCode.java</summary>

~~~java
package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class CallCode implements ByteCode, Jumpable {
    private String id;
    private int resolvedAddress;
    private String args;

    public CallCode(String[] args) {
        id = args[0];
    }

    //IMPORTANT: Saves return address and jumps to the function's location
    @Override
    public void execute(VirtualMachine vm) {
        vm.addReturnAddress();
        vm.jump(resolvedAddress);
        args = vm.getFrameValues();
    }

    @Override
    public void setAddress(int address) {
        resolvedAddress = address;
    }

    @Override
    public String toString() {
        String base = "CALL " + id + "\t" + id.split("<<|>>")[0] + "(";
        if (args != null) {
            base += args;
        }
        base += ")";
        return base;
    }
}

~~~

</details>



<details>
    <summary>./interpreter/bytecodes/WriteCode.java</summary>

~~~java
package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class WriteCode implements ByteCode {
    public WriteCode() {
        //Instantiate WriteCode but does nothing
    }

    @Override
    public void execute(VirtualMachine vm) {
        System.out.println(vm.peek());
    }

    @Override
    public String toString() {
        return "WRITE";
    }
}
~~~

</details>



<details>
    <summary>./interpreter/bytecodes/BopCode.java</summary>

~~~java
package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class BopCode implements ByteCode {
    private String operator;

    public BopCode(String[] args) {
        operator = args[0];
    }

    @Override
    public void execute(VirtualMachine vm) {
        int secondOperand = vm.pop(1);
        int firstOperand = vm.pop(1);

        switch(operator) {
            case "+" -> vm.push(firstOperand + secondOperand);
            case "-" -> vm.push(firstOperand - secondOperand);
            case "/" -> vm.push(firstOperand / secondOperand);
            case "*" -> vm.push(firstOperand * secondOperand);
            case "==" -> vm.push(firstOperand == secondOperand ? 1 : 0);
            case "!=" -> vm.push(firstOperand != secondOperand ? 1 : 0);
            case "<=" -> vm.push(firstOperand <= secondOperand ? 1 : 0);
            case ">=" -> vm.push(firstOperand >= secondOperand ? 1 : 0);
            case "<" -> vm.push(firstOperand < secondOperand ? 1 : 0);
            case ">" -> vm.push(firstOperand > secondOperand ? 1 : 0);
            case "&" -> vm.push((firstOperand == 1) && (secondOperand == 1) ? 1 : 0);
            case "|" -> vm.push((firstOperand == 1) || (secondOperand == 1) ? 1 : 0);
            default -> throw new UnsupportedOperationException("Unsupported operator.");
        }
    }

    @Override
    public String toString() {
        return "BOP " + operator;
    }
}

~~~

</details>



<details>
    <summary>./interpreter/bytecodes/GotoCode.java</summary>

~~~java
package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class GotoCode implements ByteCode, Jumpable {
    private int resolvedAddress; //int as it is the line number (stack position)
    private String label;

    public GotoCode(String[] args) {
        label = args[0];
    }

    @Override
    public void execute(VirtualMachine vm) {
        vm.jump(resolvedAddress);
    }

    @Override
    public void setAddress(int address) {
        resolvedAddress = address;
    }

    @Override
    public String toString() {
        return "GOTO " + label;
    }
}

~~~

</details>



<details>
    <summary>./interpreter/loaders/ByteCodeLoader.java</summary>

~~~java
package interpreter.loaders;

import interpreter.bytecodes.ByteCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public final class ByteCodeLoader {
    private String codSourceFileName;
    
    /**
     * Constructs ByteCodeLoader object given a COD source code
     * file name
     * @param fileName name of .cod File to load.
     */
    public ByteCodeLoader(String fileName){
        this.codSourceFileName = fileName;
    }
    
    /**
     * Loads a program from a .cod file.
     * @return a constructed Program Object.
     * @throws InvalidProgramException thrown when 
     * loadCodes fails.
     */
    public Program loadCodes() throws InvalidProgramException {
        File myFile = new File(codSourceFileName);
        Program program = new Program();

        try (Scanner myReader = new Scanner(myFile)) {
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String[] parts = line.split("\\s+");

                String byteCodeName = CodeTable.getClassName(parts[0]);
                String[] args = new String[parts.length - 1];
                System.arraycopy(parts, 1, args, 0, args.length);

                ByteCode BC = ByteCode.getInstance(byteCodeName, args);
                program.addCode(BC);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found: " + codSourceFileName, e);
        }

        return program;
    }
}

~~~

</details>



<details>
    <summary>./interpreter/loaders/CodeTable.java</summary>

~~~java
/**
 * Code table of byte codes in language X
 * @key name of a specific byte code
 * @value name of the class that the key belongs to.
 */
package interpreter.loaders;

import java.util.Map;
import java.util.HashMap;

public final class CodeTable {
   private static final Map<String, String> ByteCodes = new HashMap<>();

   private CodeTable() {
      // do nothing
   }

   /**
    * fill code table with class name mappings
    */
   public static void init() {
      ByteCodes.put("HALT", "HaltCode");
      ByteCodes.put("POP", "PopCode");
      ByteCodes.put("FALSEBRANCH", "FalseBranchCode");
      ByteCodes.put("GOTO", "GotoCode");
      ByteCodes.put("STORE", "StoreCode");
      ByteCodes.put("LOAD", "LoadCode");
      ByteCodes.put("LIT", "LitCode");
      ByteCodes.put("ARGS", "ArgsCode");
      ByteCodes.put("CALL", "CallCode");
      ByteCodes.put("RETURN", "ReturnCode");
      ByteCodes.put("BOP", "BopCode");
      ByteCodes.put("READ", "ReadCode");
      ByteCodes.put("WRITE", "WriteCode");
      ByteCodes.put("LABEL", "LabelCode");
      ByteCodes.put("VERBOSE", "VerboseCode");
   }

   /**
    * Returns the ByteCode class name for a given token.
    * @param token bytecode to map. For example, HALT --> HaltCode
    * @return class name of bytecode
    */
   public static String getClassName(String token) {
      return ByteCodes.get(token);
   }

}

~~~

</details>



<details>
    <summary>./interpreter/loaders/InvalidProgramException.java</summary>

~~~java
package interpreter.loaders;

/**
 * Exception for when loadCode fails.
 * This exception is used to bubble up all
 * exceptions that can be thrown by loadCodes.
 * 
 * DO NOT ADD ANY ADDITIONAL Constructors.
 */
public class InvalidProgramException extends Exception {
    public InvalidProgramException(Throwable ex) {
        super(ex);
    }

    public InvalidProgramException(Throwable ex, String message){
        super(message, ex);
    }

    public InvalidProgramException(String message){
        super(message);
    }
}

~~~

</details>



<details>
    <summary>./interpreter/loaders/Program.java</summary>

~~~java
package interpreter.loaders;

import interpreter.bytecodes.ByteCode;
import interpreter.bytecodes.Jumpable;
import interpreter.bytecodes.*; //remove later
import interpreter.virtualmachine.VirtualMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Program {

    private List<ByteCode> program;

    /**
     * Instantiates a program object using an
     * ArrayList
     */
    public Program() {
        this.program = new ArrayList<>();
    }

    /**
     * Gets the size of the current program.
     * @return size of program
     */
    public int getSize() {
        return program.size();
    }

    /**
     * Grabs an instance of a bytecode at an index.
     * @param programCounter index of bytecode to get.
     * @return a bytecode.
     */
    public ByteCode getCode(int programCounter) {
        return program.get(programCounter);
    }

    /**
     * Adds a bytecode instance to the Program List.
     * @param c bytecode to be added
     */
    public void addCode(ByteCode c) {
        program.add(c);
    }

    /**
     * Makes multiple passes through the program ArrayList
     * resolving address for Goto,Call and FalseBranch
     * bytecodes. These bytecodes can only jump to Label
     * codes that have a matching label value.
     * HINT: make note of what type of data-structure
     * ByteCodes are stored in.
     * **** METHOD SIGNATURE CANNOT BE CHANGED *****
     */
    public void resolveAddress() {
        HashMap<String, Integer> labelAddress = new HashMap<>();
        VirtualMachine vm = new VirtualMachine(this);

        int index = 0;
        //Assign the appropriate index to the label Bytecodes
        for (ByteCode c : program) {
            if (c instanceof LabelCode) {
                String label = vm.getLabel(c.toString());
                labelAddress.put(label, index);
            }
            index++;
        }

        //Resolve the address of the ByteCodes that jumps. Assigns the index to label.
        for (ByteCode c : program) {
            if (c instanceof Jumpable) {
                String label = vm.getLabel(c.toString());
                if (label != null) {
                    int address = labelAddress.get(label);
                    Jumpable bytecode = (Jumpable) c;
                    bytecode.setAddress(address);
                }
            }
        }
    }
}   
~~~

</details>




## Factorial Verbose -- Input : 6



~~~bash
VERBOSE ON
[]
GOTO start<<1>>
[]
GOTO continue<<3>>
[]
ARGS 0
[] []
CALL Read	Read( )
[] []
Please enter an integer: READ
[] [6]
RETURN 
[6]
ARGS 1
[] [6]
CALL factorial<<2>>	factorial(6)
[] [6]
LOAD 0 n	<load n>
[] [6, 6]
LIT 2
[] [6, 6, 2]
BOP <
[] [6, 0]
FALSEBRANCH else<<4>>
[] [6]
LOAD 0 n	<load n>
[] [6, 6]
LOAD 0 n	<load n>
[] [6, 6, 6]
LIT 1
[] [6, 6, 6, 1]
BOP -
[] [6, 6, 5]
ARGS 1
[] [6, 6] [5]
CALL factorial<<2>>	factorial(5)
[] [6, 6] [5]
LOAD 0 n	<load n>
[] [6, 6] [5, 5]
LIT 2
[] [6, 6] [5, 5, 2]
BOP <
[] [6, 6] [5, 0]
FALSEBRANCH else<<4>>
[] [6, 6] [5]
LOAD 0 n	<load n>
[] [6, 6] [5, 5]
LOAD 0 n	<load n>
[] [6, 6] [5, 5, 5]
LIT 1
[] [6, 6] [5, 5, 5, 1]
BOP -
[] [6, 6] [5, 5, 4]
ARGS 1
[] [6, 6] [5, 5] [4]
CALL factorial<<2>>	factorial(4)
[] [6, 6] [5, 5] [4]
LOAD 0 n	<load n>
[] [6, 6] [5, 5] [4, 4]
LIT 2
[] [6, 6] [5, 5] [4, 4, 2]
BOP <
[] [6, 6] [5, 5] [4, 0]
FALSEBRANCH else<<4>>
[] [6, 6] [5, 5] [4]
LOAD 0 n	<load n>
[] [6, 6] [5, 5] [4, 4]
LOAD 0 n	<load n>
[] [6, 6] [5, 5] [4, 4, 4]
LIT 1
[] [6, 6] [5, 5] [4, 4, 4, 1]
BOP -
[] [6, 6] [5, 5] [4, 4, 3]
ARGS 1
[] [6, 6] [5, 5] [4, 4] [3]
CALL factorial<<2>>	factorial(3)
[] [6, 6] [5, 5] [4, 4] [3]
LOAD 0 n	<load n>
[] [6, 6] [5, 5] [4, 4] [3, 3]
LIT 2
[] [6, 6] [5, 5] [4, 4] [3, 3, 2]
BOP <
[] [6, 6] [5, 5] [4, 4] [3, 0]
FALSEBRANCH else<<4>>
[] [6, 6] [5, 5] [4, 4] [3]
LOAD 0 n	<load n>
[] [6, 6] [5, 5] [4, 4] [3, 3]
LOAD 0 n	<load n>
[] [6, 6] [5, 5] [4, 4] [3, 3, 3]
LIT 1
[] [6, 6] [5, 5] [4, 4] [3, 3, 3, 1]
BOP -
[] [6, 6] [5, 5] [4, 4] [3, 3, 2]
ARGS 1
[] [6, 6] [5, 5] [4, 4] [3, 3] [2]
CALL factorial<<2>>	factorial(2)
[] [6, 6] [5, 5] [4, 4] [3, 3] [2]
LOAD 0 n	<load n>
[] [6, 6] [5, 5] [4, 4] [3, 3] [2, 2]
LIT 2
[] [6, 6] [5, 5] [4, 4] [3, 3] [2, 2, 2]
BOP <
[] [6, 6] [5, 5] [4, 4] [3, 3] [2, 0]
FALSEBRANCH else<<4>>
[] [6, 6] [5, 5] [4, 4] [3, 3] [2]
LOAD 0 n	<load n>
[] [6, 6] [5, 5] [4, 4] [3, 3] [2, 2]
LOAD 0 n	<load n>
[] [6, 6] [5, 5] [4, 4] [3, 3] [2, 2, 2]
LIT 1
[] [6, 6] [5, 5] [4, 4] [3, 3] [2, 2, 2, 1]
BOP -
[] [6, 6] [5, 5] [4, 4] [3, 3] [2, 2, 1]
ARGS 1
[] [6, 6] [5, 5] [4, 4] [3, 3] [2, 2] [1]
CALL factorial<<2>>	factorial(1)
[] [6, 6] [5, 5] [4, 4] [3, 3] [2, 2] [1]
LOAD 0 n	<load n>
[] [6, 6] [5, 5] [4, 4] [3, 3] [2, 2] [1, 1]
LIT 2
[] [6, 6] [5, 5] [4, 4] [3, 3] [2, 2] [1, 1, 2]
BOP <
[] [6, 6] [5, 5] [4, 4] [3, 3] [2, 2] [1, 1]
FALSEBRANCH else<<4>>
[] [6, 6] [5, 5] [4, 4] [3, 3] [2, 2] [1]
LIT 1
[] [6, 6] [5, 5] [4, 4] [3, 3] [2, 2] [1, 1]
RETURN factorial<<2>>	EXIT factorial : 1
[] [6, 6] [5, 5] [4, 4] [3, 3] [2, 2, 1]
BOP *
[] [6, 6] [5, 5] [4, 4] [3, 3] [2, 2]
RETURN factorial<<2>>	EXIT factorial : 2
[] [6, 6] [5, 5] [4, 4] [3, 3, 2]
BOP *
[] [6, 6] [5, 5] [4, 4] [3, 6]
RETURN factorial<<2>>	EXIT factorial : 6
[] [6, 6] [5, 5] [4, 4, 6]
BOP *
[] [6, 6] [5, 5] [4, 24]
RETURN factorial<<2>>	EXIT factorial : 24
[] [6, 6] [5, 5, 24]
BOP *
[] [6, 6] [5, 120]
RETURN factorial<<2>>	EXIT factorial : 120
[] [6, 6, 120]
BOP *
[] [6, 720]
RETURN factorial<<2>>	EXIT factorial : 720
[720]
ARGS 1
[] [720]
CALL Write	Write(720)
[] [720]
LOAD 0 dummyFormal	<load dummyFormal>
[] [720, 720]
720
WRITE
[] [720, 720]
RETURN 
[720]
POP 3
[]

~~~
    


## Factorial -- Input : 6



~~~bash
Please enter an integer: 720

~~~
    


## Fib Verbose -- Input : 6



~~~bash
VERBOSE ON
[]
GOTO start<<1>>
[]
LIT 0 x	int x
[0]
GOTO continue<<3>>
[0]
LIT 0 k	int k
[0, 0]
LIT 5
[0, 0, 5]
STORE 0 x	x=5
[5, 0]
ARGS 0
[5, 0] []
CALL Read	Read( )
[5, 0] []
Please enter an integer: READ
[5, 0] [6]
RETURN 
[5, 0, 6]
ARGS 1
[5, 0] [6]
CALL fib<<2>>	fib(6)
[5, 0] [6]
LOAD 0 n	<load n>
[5, 0] [6, 6]
LIT 1
[5, 0] [6, 6, 1]
BOP <=
[5, 0] [6, 0]
FALSEBRANCH else<<4>>
[5, 0] [6]
LOAD 0 n	<load n>
[5, 0] [6, 6]
LIT 2
[5, 0] [6, 6, 2]
BOP ==
[5, 0] [6, 0]
FALSEBRANCH else<<6>>
[5, 0] [6]
LOAD 0 n	<load n>
[5, 0] [6, 6]
LIT 2
[5, 0] [6, 6, 2]
BOP -
[5, 0] [6, 4]
ARGS 1
[5, 0] [6] [4]
CALL fib<<2>>	fib(4)
[5, 0] [6] [4]
LOAD 0 n	<load n>
[5, 0] [6] [4, 4]
LIT 1
[5, 0] [6] [4, 4, 1]
BOP <=
[5, 0] [6] [4, 0]
FALSEBRANCH else<<4>>
[5, 0] [6] [4]
LOAD 0 n	<load n>
[5, 0] [6] [4, 4]
LIT 2
[5, 0] [6] [4, 4, 2]
BOP ==
[5, 0] [6] [4, 0]
FALSEBRANCH else<<6>>
[5, 0] [6] [4]
LOAD 0 n	<load n>
[5, 0] [6] [4, 4]
LIT 2
[5, 0] [6] [4, 4, 2]
BOP -
[5, 0] [6] [4, 2]
ARGS 1
[5, 0] [6] [4] [2]
CALL fib<<2>>	fib(2)
[5, 0] [6] [4] [2]
LOAD 0 n	<load n>
[5, 0] [6] [4] [2, 2]
LIT 1
[5, 0] [6] [4] [2, 2, 1]
BOP <=
[5, 0] [6] [4] [2, 0]
FALSEBRANCH else<<4>>
[5, 0] [6] [4] [2]
LOAD 0 n	<load n>
[5, 0] [6] [4] [2, 2]
LIT 2
[5, 0] [6] [4] [2, 2, 2]
BOP ==
[5, 0] [6] [4] [2, 1]
FALSEBRANCH else<<6>>
[5, 0] [6] [4] [2]
LIT 1
[5, 0] [6] [4] [2, 1]
RETURN fib<<2>>	EXIT fib : 1
[5, 0] [6] [4, 1]
LOAD 0 n	<load n>
[5, 0] [6] [4, 1, 4]
LIT 1
[5, 0] [6] [4, 1, 4, 1]
BOP -
[5, 0] [6] [4, 1, 3]
ARGS 1
[5, 0] [6] [4, 1] [3]
CALL fib<<2>>	fib(3)
[5, 0] [6] [4, 1] [3]
LOAD 0 n	<load n>
[5, 0] [6] [4, 1] [3, 3]
LIT 1
[5, 0] [6] [4, 1] [3, 3, 1]
BOP <=
[5, 0] [6] [4, 1] [3, 0]
FALSEBRANCH else<<4>>
[5, 0] [6] [4, 1] [3]
LOAD 0 n	<load n>
[5, 0] [6] [4, 1] [3, 3]
LIT 2
[5, 0] [6] [4, 1] [3, 3, 2]
BOP ==
[5, 0] [6] [4, 1] [3, 0]
FALSEBRANCH else<<6>>
[5, 0] [6] [4, 1] [3]
LOAD 0 n	<load n>
[5, 0] [6] [4, 1] [3, 3]
LIT 2
[5, 0] [6] [4, 1] [3, 3, 2]
BOP -
[5, 0] [6] [4, 1] [3, 1]
ARGS 1
[5, 0] [6] [4, 1] [3] [1]
CALL fib<<2>>	fib(1)
[5, 0] [6] [4, 1] [3] [1]
LOAD 0 n	<load n>
[5, 0] [6] [4, 1] [3] [1, 1]
LIT 1
[5, 0] [6] [4, 1] [3] [1, 1, 1]
BOP <=
[5, 0] [6] [4, 1] [3] [1, 1]
FALSEBRANCH else<<4>>
[5, 0] [6] [4, 1] [3] [1]
LIT 1
[5, 0] [6] [4, 1] [3] [1, 1]
RETURN fib<<2>>	EXIT fib : 1
[5, 0] [6] [4, 1] [3, 1]
LOAD 0 n	<load n>
[5, 0] [6] [4, 1] [3, 1, 3]
LIT 1
[5, 0] [6] [4, 1] [3, 1, 3, 1]
BOP -
[5, 0] [6] [4, 1] [3, 1, 2]
ARGS 1
[5, 0] [6] [4, 1] [3, 1] [2]
CALL fib<<2>>	fib(2)
[5, 0] [6] [4, 1] [3, 1] [2]
LOAD 0 n	<load n>
[5, 0] [6] [4, 1] [3, 1] [2, 2]
LIT 1
[5, 0] [6] [4, 1] [3, 1] [2, 2, 1]
BOP <=
[5, 0] [6] [4, 1] [3, 1] [2, 0]
FALSEBRANCH else<<4>>
[5, 0] [6] [4, 1] [3, 1] [2]
LOAD 0 n	<load n>
[5, 0] [6] [4, 1] [3, 1] [2, 2]
LIT 2
[5, 0] [6] [4, 1] [3, 1] [2, 2, 2]
BOP ==
[5, 0] [6] [4, 1] [3, 1] [2, 1]
FALSEBRANCH else<<6>>
[5, 0] [6] [4, 1] [3, 1] [2]
LIT 1
[5, 0] [6] [4, 1] [3, 1] [2, 1]
RETURN fib<<2>>	EXIT fib : 1
[5, 0] [6] [4, 1] [3, 1, 1]
BOP +
[5, 0] [6] [4, 1] [3, 2]
RETURN fib<<2>>	EXIT fib : 2
[5, 0] [6] [4, 1, 2]
BOP +
[5, 0] [6] [4, 3]
RETURN fib<<2>>	EXIT fib : 3
[5, 0] [6, 3]
LOAD 0 n	<load n>
[5, 0] [6, 3, 6]
LIT 1
[5, 0] [6, 3, 6, 1]
BOP -
[5, 0] [6, 3, 5]
ARGS 1
[5, 0] [6, 3] [5]
CALL fib<<2>>	fib(5)
[5, 0] [6, 3] [5]
LOAD 0 n	<load n>
[5, 0] [6, 3] [5, 5]
LIT 1
[5, 0] [6, 3] [5, 5, 1]
BOP <=
[5, 0] [6, 3] [5, 0]
FALSEBRANCH else<<4>>
[5, 0] [6, 3] [5]
LOAD 0 n	<load n>
[5, 0] [6, 3] [5, 5]
LIT 2
[5, 0] [6, 3] [5, 5, 2]
BOP ==
[5, 0] [6, 3] [5, 0]
FALSEBRANCH else<<6>>
[5, 0] [6, 3] [5]
LOAD 0 n	<load n>
[5, 0] [6, 3] [5, 5]
LIT 2
[5, 0] [6, 3] [5, 5, 2]
BOP -
[5, 0] [6, 3] [5, 3]
ARGS 1
[5, 0] [6, 3] [5] [3]
CALL fib<<2>>	fib(3)
[5, 0] [6, 3] [5] [3]
LOAD 0 n	<load n>
[5, 0] [6, 3] [5] [3, 3]
LIT 1
[5, 0] [6, 3] [5] [3, 3, 1]
BOP <=
[5, 0] [6, 3] [5] [3, 0]
FALSEBRANCH else<<4>>
[5, 0] [6, 3] [5] [3]
LOAD 0 n	<load n>
[5, 0] [6, 3] [5] [3, 3]
LIT 2
[5, 0] [6, 3] [5] [3, 3, 2]
BOP ==
[5, 0] [6, 3] [5] [3, 0]
FALSEBRANCH else<<6>>
[5, 0] [6, 3] [5] [3]
LOAD 0 n	<load n>
[5, 0] [6, 3] [5] [3, 3]
LIT 2
[5, 0] [6, 3] [5] [3, 3, 2]
BOP -
[5, 0] [6, 3] [5] [3, 1]
ARGS 1
[5, 0] [6, 3] [5] [3] [1]
CALL fib<<2>>	fib(1)
[5, 0] [6, 3] [5] [3] [1]
LOAD 0 n	<load n>
[5, 0] [6, 3] [5] [3] [1, 1]
LIT 1
[5, 0] [6, 3] [5] [3] [1, 1, 1]
BOP <=
[5, 0] [6, 3] [5] [3] [1, 1]
FALSEBRANCH else<<4>>
[5, 0] [6, 3] [5] [3] [1]
LIT 1
[5, 0] [6, 3] [5] [3] [1, 1]
RETURN fib<<2>>	EXIT fib : 1
[5, 0] [6, 3] [5] [3, 1]
LOAD 0 n	<load n>
[5, 0] [6, 3] [5] [3, 1, 3]
LIT 1
[5, 0] [6, 3] [5] [3, 1, 3, 1]
BOP -
[5, 0] [6, 3] [5] [3, 1, 2]
ARGS 1
[5, 0] [6, 3] [5] [3, 1] [2]
CALL fib<<2>>	fib(2)
[5, 0] [6, 3] [5] [3, 1] [2]
LOAD 0 n	<load n>
[5, 0] [6, 3] [5] [3, 1] [2, 2]
LIT 1
[5, 0] [6, 3] [5] [3, 1] [2, 2, 1]
BOP <=
[5, 0] [6, 3] [5] [3, 1] [2, 0]
FALSEBRANCH else<<4>>
[5, 0] [6, 3] [5] [3, 1] [2]
LOAD 0 n	<load n>
[5, 0] [6, 3] [5] [3, 1] [2, 2]
LIT 2
[5, 0] [6, 3] [5] [3, 1] [2, 2, 2]
BOP ==
[5, 0] [6, 3] [5] [3, 1] [2, 1]
FALSEBRANCH else<<6>>
[5, 0] [6, 3] [5] [3, 1] [2]
LIT 1
[5, 0] [6, 3] [5] [3, 1] [2, 1]
RETURN fib<<2>>	EXIT fib : 1
[5, 0] [6, 3] [5] [3, 1, 1]
BOP +
[5, 0] [6, 3] [5] [3, 2]
RETURN fib<<2>>	EXIT fib : 2
[5, 0] [6, 3] [5, 2]
LOAD 0 n	<load n>
[5, 0] [6, 3] [5, 2, 5]
LIT 1
[5, 0] [6, 3] [5, 2, 5, 1]
BOP -
[5, 0] [6, 3] [5, 2, 4]
ARGS 1
[5, 0] [6, 3] [5, 2] [4]
CALL fib<<2>>	fib(4)
[5, 0] [6, 3] [5, 2] [4]
LOAD 0 n	<load n>
[5, 0] [6, 3] [5, 2] [4, 4]
LIT 1
[5, 0] [6, 3] [5, 2] [4, 4, 1]
BOP <=
[5, 0] [6, 3] [5, 2] [4, 0]
FALSEBRANCH else<<4>>
[5, 0] [6, 3] [5, 2] [4]
LOAD 0 n	<load n>
[5, 0] [6, 3] [5, 2] [4, 4]
LIT 2
[5, 0] [6, 3] [5, 2] [4, 4, 2]
BOP ==
[5, 0] [6, 3] [5, 2] [4, 0]
FALSEBRANCH else<<6>>
[5, 0] [6, 3] [5, 2] [4]
LOAD 0 n	<load n>
[5, 0] [6, 3] [5, 2] [4, 4]
LIT 2
[5, 0] [6, 3] [5, 2] [4, 4, 2]
BOP -
[5, 0] [6, 3] [5, 2] [4, 2]
ARGS 1
[5, 0] [6, 3] [5, 2] [4] [2]
CALL fib<<2>>	fib(2)
[5, 0] [6, 3] [5, 2] [4] [2]
LOAD 0 n	<load n>
[5, 0] [6, 3] [5, 2] [4] [2, 2]
LIT 1
[5, 0] [6, 3] [5, 2] [4] [2, 2, 1]
BOP <=
[5, 0] [6, 3] [5, 2] [4] [2, 0]
FALSEBRANCH else<<4>>
[5, 0] [6, 3] [5, 2] [4] [2]
LOAD 0 n	<load n>
[5, 0] [6, 3] [5, 2] [4] [2, 2]
LIT 2
[5, 0] [6, 3] [5, 2] [4] [2, 2, 2]
BOP ==
[5, 0] [6, 3] [5, 2] [4] [2, 1]
FALSEBRANCH else<<6>>
[5, 0] [6, 3] [5, 2] [4] [2]
LIT 1
[5, 0] [6, 3] [5, 2] [4] [2, 1]
RETURN fib<<2>>	EXIT fib : 1
[5, 0] [6, 3] [5, 2] [4, 1]
LOAD 0 n	<load n>
[5, 0] [6, 3] [5, 2] [4, 1, 4]
LIT 1
[5, 0] [6, 3] [5, 2] [4, 1, 4, 1]
BOP -
[5, 0] [6, 3] [5, 2] [4, 1, 3]
ARGS 1
[5, 0] [6, 3] [5, 2] [4, 1] [3]
CALL fib<<2>>	fib(3)
[5, 0] [6, 3] [5, 2] [4, 1] [3]
LOAD 0 n	<load n>
[5, 0] [6, 3] [5, 2] [4, 1] [3, 3]
LIT 1
[5, 0] [6, 3] [5, 2] [4, 1] [3, 3, 1]
BOP <=
[5, 0] [6, 3] [5, 2] [4, 1] [3, 0]
FALSEBRANCH else<<4>>
[5, 0] [6, 3] [5, 2] [4, 1] [3]
LOAD 0 n	<load n>
[5, 0] [6, 3] [5, 2] [4, 1] [3, 3]
LIT 2
[5, 0] [6, 3] [5, 2] [4, 1] [3, 3, 2]
BOP ==
[5, 0] [6, 3] [5, 2] [4, 1] [3, 0]
FALSEBRANCH else<<6>>
[5, 0] [6, 3] [5, 2] [4, 1] [3]
LOAD 0 n	<load n>
[5, 0] [6, 3] [5, 2] [4, 1] [3, 3]
LIT 2
[5, 0] [6, 3] [5, 2] [4, 1] [3, 3, 2]
BOP -
[5, 0] [6, 3] [5, 2] [4, 1] [3, 1]
ARGS 1
[5, 0] [6, 3] [5, 2] [4, 1] [3] [1]
CALL fib<<2>>	fib(1)
[5, 0] [6, 3] [5, 2] [4, 1] [3] [1]
LOAD 0 n	<load n>
[5, 0] [6, 3] [5, 2] [4, 1] [3] [1, 1]
LIT 1
[5, 0] [6, 3] [5, 2] [4, 1] [3] [1, 1, 1]
BOP <=
[5, 0] [6, 3] [5, 2] [4, 1] [3] [1, 1]
FALSEBRANCH else<<4>>
[5, 0] [6, 3] [5, 2] [4, 1] [3] [1]
LIT 1
[5, 0] [6, 3] [5, 2] [4, 1] [3] [1, 1]
RETURN fib<<2>>	EXIT fib : 1
[5, 0] [6, 3] [5, 2] [4, 1] [3, 1]
LOAD 0 n	<load n>
[5, 0] [6, 3] [5, 2] [4, 1] [3, 1, 3]
LIT 1
[5, 0] [6, 3] [5, 2] [4, 1] [3, 1, 3, 1]
BOP -
[5, 0] [6, 3] [5, 2] [4, 1] [3, 1, 2]
ARGS 1
[5, 0] [6, 3] [5, 2] [4, 1] [3, 1] [2]
CALL fib<<2>>	fib(2)
[5, 0] [6, 3] [5, 2] [4, 1] [3, 1] [2]
LOAD 0 n	<load n>
[5, 0] [6, 3] [5, 2] [4, 1] [3, 1] [2, 2]
LIT 1
[5, 0] [6, 3] [5, 2] [4, 1] [3, 1] [2, 2, 1]
BOP <=
[5, 0] [6, 3] [5, 2] [4, 1] [3, 1] [2, 0]
FALSEBRANCH else<<4>>
[5, 0] [6, 3] [5, 2] [4, 1] [3, 1] [2]
LOAD 0 n	<load n>
[5, 0] [6, 3] [5, 2] [4, 1] [3, 1] [2, 2]
LIT 2
[5, 0] [6, 3] [5, 2] [4, 1] [3, 1] [2, 2, 2]
BOP ==
[5, 0] [6, 3] [5, 2] [4, 1] [3, 1] [2, 1]
FALSEBRANCH else<<6>>
[5, 0] [6, 3] [5, 2] [4, 1] [3, 1] [2]
LIT 1
[5, 0] [6, 3] [5, 2] [4, 1] [3, 1] [2, 1]
RETURN fib<<2>>	EXIT fib : 1
[5, 0] [6, 3] [5, 2] [4, 1] [3, 1, 1]
BOP +
[5, 0] [6, 3] [5, 2] [4, 1] [3, 2]
RETURN fib<<2>>	EXIT fib : 2
[5, 0] [6, 3] [5, 2] [4, 1, 2]
BOP +
[5, 0] [6, 3] [5, 2] [4, 3]
RETURN fib<<2>>	EXIT fib : 3
[5, 0] [6, 3] [5, 2, 3]
BOP +
[5, 0] [6, 3] [5, 5]
RETURN fib<<2>>	EXIT fib : 5
[5, 0] [6, 3, 5]
BOP +
[5, 0] [6, 8]
RETURN fib<<2>>	EXIT fib : 8
[5, 0, 8]
ARGS 1
[5, 0] [8]
CALL Write	Write(8)
[5, 0] [8]
LOAD 0 dummyFormal	<load dummyFormal>
[5, 0] [8, 8]
8
WRITE
[5, 0] [8, 8]
RETURN 
[5, 0, 8]
STORE 1 k	k=8
[5, 8]
LIT 0 x	int x
[5, 8, 0]
LIT 7
[5, 8, 0, 7]
STORE 2 x	x=7
[5, 8, 7]
LIT 8
[5, 8, 7, 8]
STORE 2 x	x=8
[5, 8, 8]
POP 1
[5, 8]
POP 2
[]

~~~
    


## Fib -- Input : 6



~~~bash
Please enter an integer: 8

~~~
    


## Function Args Verbose Test



~~~bash
VERBOSE ON
[]
GOTO CONTINUE<<1>>
[]
GOTO CONTINUE<<2>>
[]
GOTO CONTINUE<<3>>
[]
GOTO CONTINUE<<4>>
[]
LIT 0
[0]
LIT 1
[0, 1]
ARGS 2
[] [0, 1]
CALL doublePrint<<1>>	doublePrint(0, 1)
[] [0, 1]
LOAD 0
[] [0, 1, 0]
0
WRITE
[] [0, 1, 0]
POP 1
[] [0, 1]
LOAD 1
[] [0, 1, 1]
1
WRITE
[] [0, 1, 1]
POP 1
[] [0, 1]
RETURN doublePrint<<1>>	EXIT doublePrint : 1
[1]
POP 1
[]
LIT 0
[0]
LIT 1
[0, 1]
LIT 2
[0, 1, 2]
ARGS 3
[] [0, 1, 2]
CALL triplePrint<<1>>	triplePrint(0, 1, 2)
[] [0, 1, 2]
LOAD 0
[] [0, 1, 2, 0]
0
WRITE
[] [0, 1, 2, 0]
POP 1
[] [0, 1, 2]
LOAD 1
[] [0, 1, 2, 1]
1
WRITE
[] [0, 1, 2, 1]
POP 1
[] [0, 1, 2]
LOAD 2
[] [0, 1, 2, 2]
2
WRITE
[] [0, 1, 2, 2]
POP 2
[] [0, 1]
RETURN triplePrint<<1>>	EXIT triplePrint : 1
[1]
POP 1
[]
LIT 0
[0]
LIT 1
[0, 1]
LIT 2
[0, 1, 2]
LIT 3
[0, 1, 2, 3]
ARGS 4
[] [0, 1, 2, 3]
CALL quadruplePrint<<1>>	quadruplePrint(0, 1, 2, 3)
[] [0, 1, 2, 3]
LOAD 0
[] [0, 1, 2, 3, 0]
0
WRITE
[] [0, 1, 2, 3, 0]
POP 1
[] [0, 1, 2, 3]
LOAD 1
[] [0, 1, 2, 3, 1]
1
WRITE
[] [0, 1, 2, 3, 1]
POP 1
[] [0, 1, 2, 3]
LOAD 2
[] [0, 1, 2, 3, 2]
2
WRITE
[] [0, 1, 2, 3, 2]
POP 1
[] [0, 1, 2, 3]
LOAD 3
[] [0, 1, 2, 3, 3]
3
WRITE
[] [0, 1, 2, 3, 3]
POP 1
[] [0, 1, 2, 3]
RETURN quadruplePrint<<1>>	EXIT quadruplePrint : 3
[3]
POP 66
[]

~~~
    


## Function Args Test



~~~bash
0
1
0
1
2
0
1
2
3

~~~
    
