package test02.ch12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
@SuppressWarnings("1111") // ��ȿ���� ���� �ֳ����̼��� ���õȴ�.
@TestInfo(testedBy="aaa", testDate=@DateTime(yymmdd="160101", hhmmss="235959"))
class AnnotationEx5 {
	public static void main(String args[]) {
		// AnnotaionEx5�� Class��ü�� ��´�.
		Class<AnnotationEx5> cls = AnnotationEx5.class;
		
		TestInfo anno = (TestInfo)cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testedBy()="+anno.testedBy());
      	System.out.println("anno.testDate().yymmdd()="+anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss()="+anno.testDate().hhmmss());

		for(String str : anno.testTools())
			System.out.println("testTools="+str);

		System.out.println();
		
		// AnnotationEx5�� ����� ��� �ֳ����̼��� �����´�.
		Annotation[] annoArr = cls.getAnnotations();

		for(Annotation a : annoArr)
			System.out.println(a);
	} // main�� ��
}

@Retention(RetentionPolicy.RUNTIME)  // ���� �ÿ� ��밡���ϵ��� ���� 
@interface TestInfo {
	int       count()	    default 1;
	String    testedBy();
	String[]  testTools()   default "JUnit";
	TestType  testType()    default TestType.FIRST;
	DateTime  testDate();
}

@Retention(RetentionPolicy.RUNTIME)  // ���� �ÿ� ��밡���ϵ��� ����
@interface DateTime {
	String yymmdd();
	String hhmmss();
}

enum TestType { FIRST, FINAL }
