package easy.utils;

public class UIautomaortest {

		public static void tempo(int tempo) {

			int tempoSegundos1= tempo;
			tempoSegundos1 = tempoSegundos1 * 1000;
			try {
				Thread.sleep(tempoSegundos1);
			} catch (InterruptedException e) {
				e.printStackTrace();

		}
		
	}

}
