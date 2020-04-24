import com.test.javatest.Bug;
import com.test.javatest.GameHelper;
import com.test.javatest.Goblin;
import com.test.javatest.Human1;
import com.test.javatest.Human2;
import com.test.javatest.type.Human;
import com.test.javatest.type.Monster;
import com.test.javatest.type.PlayerAbstract;

public class Run {

	public static void main(String[] args) {

		GameHelper  gameHelper = new GameHelper();
		
		Monster goblin = new Goblin();
		Monster bug = new Bug();
		
		Human human1 = new Human1();
		Human human2 = new Human2();
		
		boolean isPlayed = gameHelper.playGameMonster(goblin, bug);
		isPlayed = gameHelper.playGameHuman(human1, human2);
		
		PlayerAbstract human3 = new Human1();
		PlayerAbstract goblin1 = new Goblin();
				
		boolean result = gameHelper.fight(human3, goblin1);
		System.out.println("");
		if(result) {
			System.out.println("Fight End");
		}else {
			System.out.println("Fight Fail");
		}
		
	}
}
