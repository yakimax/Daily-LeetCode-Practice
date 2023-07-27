class Solution
{
    static int findPlatform(int at[], int dt[], int n)
    {
        Arrays.sort(dt) ;
        Arrays.sort(at) ;
        int count = 1 ;
        int i = 1 ;
        int j = 0 ;
        int stations = 1 ;
        while( i < n ){
            if( at[i] <= dt[j] ){
                stations++ ;
                i++ ;
                 
            }else{
                stations-- ;
                j++ ;
            }
            if( stations > count ){
                count = stations ;
            }
        }
        return count ;
    }
    
}