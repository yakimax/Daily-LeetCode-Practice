class Solution{

    public int[] getModifiedArray(int length, int[][] updates) {
        
        int cont[] = new int[length] ;
        for( int i = 0 ; i < updates.length ; i++ ){
            cont[updates[i][0]] += updates[i][2];
            if(updates[i][1]+1<length){ 
                cont[updates[i][1]+1] -= updates[i][2];
            }
        }
        
        int sum = 0 ;
        for( int i = 0 ; i < length ; i++ ){
            sum+=cont[i];
            cont[i]= sum ;
        }
        return cont ;
    }
}