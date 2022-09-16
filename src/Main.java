import com.hankcs.hanlp.HanLP;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        String str0 = Txt.readTxt(args[0]);
        String str1 = Txt.readTxt(args[1]);
        String resultFileName = args[2];
        // 由字符串得出对应的 simHash值
        String simHash0 = SimHash.getSimHash(str0);
        String simHash1 = SimHash.getSimHash(str1);
        // 由 simHash值求出相似度
        double similarity = Hamming.getSimilarity(simHash0, simHash1);
        // 把相似度写入最后的结果文件中
        Txt.writeTxt(similarity, resultFileName);
        // 退出程序
        System.exit(0);
    }
}