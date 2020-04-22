
package integration;
public class SequentialSearch {
    public static int[] arr1 = new int[] {81, 3, -20, 15, 432};

    public static int SequentialSearch(int i) {
        String hasil;
        Save s = new Save();
        for (int j = 0; j < arr1.length; j++)
        {
            if (arr1[j] == i)
            {
                hasil = s.Simpan(Integer.toString(i),Integer.toString(j+1));
                System.out.println(hasil);
                return 1;
            }
        }
        System.out.println("Data tidak ditemukan");
        return 0;
    }
}