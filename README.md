# StudyTest
##Java*Head First*的笔记
###战舰世界的笔记
####1.Integer.parseInt("3");
 > Integer：是JAVA的内建类。
 > ParseInt:Integer的一个方法，能够将String解析成int采用String的参数该语句的功能是将String转化成为int
####2.for(int cell: locationCells ){}
 > int cell:声明出带有数组元素的变量，在循环的每次循环中，此变量的值都会带有不同的数组元素，知道跳出循环为止
 > locationCells:要被诸葛执行过的数组，每循环一次数组的下一个元素都赋给变量“cell”；
####3.numOfHits++
####4.break;

```java
package FirstDemo;  
public class No5 {
		 public static void main(String[] args){
			 SimpleDotCom dot = new SimpleDotCom();
			 int [] locations={2,3,4};
			 dot.setLocationCells(locations);
			 String userGuess = "2";
			 @SuppressWarnings("unused")
			String result = dot . checkYourself(userGuess);
		 }

}
class SimpleDotCom{
	int [] locationCells;
	int numOfHits = 0;
	public void setLocationCells(int [] locs){
		locationCells = locs;
	}
	public String checkYourself(String stringGuess){
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		for(int cell:locationCells){
			if(guess == cell){
				result = "hit";
				numOfHits++;
				break;
			}
		}
		if(numOfHits == 
				locationCells.length){
			result = "kill";
		}
		System.out.println(result);
		return result;
	}
}
```

###ArrayList:
####1.add(Object elem)
向list中加入对象参数
####2.remove（int index）
在索引参数中移除对象
####3.contains(Object elem)
如果和对象参数匹配返回true
####4.isEmpty()
如果list中没有元素返回true
####5.indexOf(Object elem)
返回对象参数的索引或-1
####6.size()
返回list中元素的一个数、
####7.get(int index)
返回当前索引参数的对象
