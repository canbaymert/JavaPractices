package _20_Map;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class C09_wordFrequency {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> wordCounter = new HashMap<>();

        List<String> lines = Files.readAllLines(Paths.get("src/_20_map/Q09_fileText"), StandardCharsets.UTF_8);

        for (String each : lines) {
            String[] words = each.toLowerCase(Locale.ROOT).split(" ");
            for (String each2 : words) {
                if (each2.endsWith(",") || each2.endsWith(".") || each2.endsWith("?")) {
                    each2 = each2.substring(0, each2.length() - 1);
                }

                if (!wordCounter.containsKey(each2)) {
                    wordCounter.put(each2, 1);
                } else {
                    wordCounter.put(each2, wordCounter.get(each2) + 1);
                }
            }
        }
        System.out.println(wordCounter);

        //{explain=1, don't=2, fought=1, your=1, when=2, mocking=1, put=2, tried=8, far=6, wasted=1, property=1,
        // doesn't=8, you=12, they=1, there's=1, in=13, lose=3, myself=1, is=2, it=20, then=1, am=1, recognize=1,
        // as=5, even=12, trying=1, valuable=1, acting=1, be=2, comes=1, eventually=2, matter=8, out=2, remind=1,
        // fell=2, how=3, fall=3, by=1, have=2, so=11, everything=2, unreal=1, apart=2, surprised=1, meant=2, mind=2,
        // a=5, wouldn't=1, though=2, one=4, knew=1, i=24, right=1, the=16, fly=1, watch=4, to=14, thing=5, but=7,
        // before=1, had=3, inside=2, anymore=1, down=1, got=4, hold=1, that=3, spite=1, me=7, things=1, only=2,
        // should=2, pendulum=1, day=1, all=11, below=1, like=1, it's=1, didn't=2, this=4, count=1, clock=1, rhyme=2,
        // my=2, look=1, were=2, keep=2, know=6, try=2, aren't=1, trust=2, away=1, memory=2, part=1, for=2, why=2,
        // back=2, swings=1, life=1, can=2, times=1, not=1, and=5, of=5, end=8, hard=8, designed=2, just=1, on=1,
        // ticks=1, will=2, remembering=1, go=4, was=1, kept=2, way=2, with=1, what=2, due=1, there=1, time=5,
        // window=1, pushed=2}
        }
}


