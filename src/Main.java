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
        String simHash0 = SimHash.getSimHash(str0);
        String simHash1 = SimHash.getSimHash(str1);
        double similarity = Hamming.getSimilarity(simHash0, simHash1);
        Txt.writeTxt(similarity, resultFileName);
        System.exit(0);;
    }
}