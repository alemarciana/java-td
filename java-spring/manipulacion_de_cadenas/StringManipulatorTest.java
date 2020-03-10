public class StringManipulatorTest {
	public static void main(String[] args) {
		StringManipulator manipulator = new StringManipulator();
		System.out.println(manipulator.trimAndConcat(" hola  ","     uwu    "));
		System.out.println(manipulator.getIndexOrNull("OwO *Notices Bulge*",'w'));
		System.out.println(manipulator.getIndexOrNull("OwO *Notices Bulge*","UwU"));
		System.out.println(manipulator.concatSubstring("OwO *Notices Bulge*",5,18,"UwU"));
	}
}
