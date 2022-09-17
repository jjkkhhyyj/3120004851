
public class Test {
    @org.junit.Test
    public void compare_add()
    {
        String str0 = Txt.readTxt("D:\\java\\仓库\\测试文本\\orig.txt");
        String str1 = Txt.readTxt("D:\\java\\仓库\\测试文本\\orig_0.8_add.txt");
        String resultFileName = "D:\\java\\仓库\\测试文本\\result.txt";
        String simHash0 = SimHash.get(str0);
        String simHash1 = SimHash.get(str1);
        double similarity = Hamming.getSimilarity(simHash0, simHash1);
        Txt.writeTxt(similarity, resultFileName);
        System.exit(0);;
    }
    @org.junit.Test
    public void compare_del()
    {
        String str0 = Txt.readTxt("D:\\java\\仓库\\测试文本\\orig.txt");
        String str1 = Txt.readTxt("D:\\java\\仓库\\测试文本\\orig_0.8_del.txt");
        String resultFileName = "D:\\java\\仓库\\测试文本\\result.txt";
        String simHash0 = SimHash.get(str0);
        String simHash1 = SimHash.get(str1);
        double similarity = Hamming.getSimilarity(simHash0, simHash1);
        Txt.writeTxt(similarity, resultFileName);
        System.exit(0);;
    }
    @org.junit.Test
    public void compare_1()
    {
        String str0 = Txt.readTxt("D:\\java\\仓库\\测试文本\\orig.txt");
        String str1 = Txt.readTxt("D:\\java\\仓库\\测试文本\\orig_0.8_dis_1.txt");
        String resultFileName = "D:\\java\\仓库\\测试文本\\result.txt";
        String simHash0 = SimHash.get(str0);
        String simHash1 = SimHash.get(str1);
        double similarity = Hamming.getSimilarity(simHash0, simHash1);
        Txt.writeTxt(similarity, resultFileName);
        System.exit(0);;
    }
    @org.junit.Test
    public void compare_10()
    {
        String str0 = Txt.readTxt("D:\\java\\仓库\\测试文本\\orig.txt");
        String str1 = Txt.readTxt("D:\\java\\仓库\\测试文本\\orig_0.8_dis_10.txt");
        String resultFileName = "D:\\java\\仓库\\测试文本\\result.txt";
        String simHash0 = SimHash.get(str0);
        String simHash1 = SimHash.get(str1);
        double similarity = Hamming.getSimilarity(simHash0, simHash1);
        Txt.writeTxt(similarity, resultFileName);
        System.exit(0);;
    }
    @org.junit.Test
    public void compare_15()
    {
        String str0 = Txt.readTxt("D:\\java\\仓库\\测试文本\\orig.txt");
        String str1 = Txt.readTxt("D:\\java\\仓库\\测试文本\\orig_0.8_dis_15.txt");
        String resultFileName = "D:\\java\\仓库\\测试文本\\result.txt";
        String simHash0 = SimHash.get(str0);
        String simHash1 = SimHash.get(str1);
        double similarity = Hamming.getSimilarity(simHash0, simHash1);
        Txt.writeTxt(similarity, resultFileName);
        System.exit(0);;
    }
}
