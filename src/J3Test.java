import static org.junit.Assert.*;

import org.junit.Test;

public class J3Test {

	@Test
	public void test() {
		int[][] m1= new int[3][3];
		m1[0][0]=1;
		m1[0][1]=0;
		m1[0][2]=0;
		m1[1][0]=0;
		m1[1][1]=1;
		m1[1][2]=0;
		m1[2][0]=0;
		m1[2][1]=0;
		m1[2][2]=1;

		int[][] m3= new int[3][3];
		m3[0][0]=2;
		m3[0][1]=0;
		m3[0][2]=0;
		m3[1][0]=0;
		m3[1][1]=2;
		m3[1][2]=0;
		m3[2][0]=0;
		m3[2][1]=0;
		m3[2][2]=2;

		
		int[][] m2= new int[3][3];
		m2[0][0]=1;
		m2[0][1]=1;
		m2[0][2]=3;
		m2[1][0]=45;
		m2[1][1]=23;
		m2[1][2]=12;
		m2[2][0]=89;
		m2[2][1]=3;
		m2[2][2]=7;

		int[][] m4= new int[3][3];
		m4[0][0]=2;
		m4[0][1]=2;
		m4[0][2]=6;
		m4[1][0]=90;
		m4[1][1]=46;
		m4[1][2]=24;
		m4[2][0]=178;
		m4[2][1]=6;
		m4[2][2]=14;

		int[][] m=new int[3][3];
		m[0][0]=1;
		m[0][1]=1;
		m[0][2]=3;
		m[1][0]=45;
		m[1][1]=23;
		m[1][2]=12;
		m[2][0]=89;
		m[2][1]=3;
		m[2][2]=7;
		
		assertEquals(m,J3.mul(m1,m2));
		assertEquals(m4,J3.mul(m3,m2));
	}
}