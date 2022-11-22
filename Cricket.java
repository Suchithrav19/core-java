class Cricket 
{
public static void main(String cricket[])
{
    int rohitHighestScore=264;
    int	 sachinHighestScore=200;
    int mandanHighestScore=135;
    int ackerr=232;
    int bjClark=229;
	int highestScore[]= {rohitHighestScore,sachinHighestScore,mandanHighestScore,ackerr,bjClark};
	for(int index=0;index<highestScore.length;index++)
	{
		System.out.println("The highestScore= "+highestScore[index]+"\n");
	}
	int ref=highestScore[4];
	int ref1=highestScore[0];
	int ref2=highestScore[1];
	System.out.println("Elements at index 4 "+ref+"\n Elements at index 0 "+ref1+"\n Element at index 1 "+ref2);
	for(int i=0;i<highestScore.length;i++)
	{
		int refs=highestScore[i];
		System.out.println("Elements at the index"+i+" "+refs);
	}
	}
}
	