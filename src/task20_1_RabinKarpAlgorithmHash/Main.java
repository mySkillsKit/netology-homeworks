package task20_1_RabinKarpAlgorithmHash;

public class Main {

    public static void main(String[] args) {

        System.out.println("Домашнее задание к занятию 6. Хеширование\n" +
                "Рабин-Карп с шаблонами\n");

        String source = "Alibaba or Alibubab? I do not know!";
        String pattern = "b*b"; //under this pattern match: bab (c 3), bub (c 14) and bab (c 16).
        System.out.println("Строка, в которой будем искать: " + source);
        System.out.println("В качестве шаблона возьмём: " + pattern);
        int s = source.length(); //length string source
        int p = pattern.length(); //length string pattern

        //System.out.println(pattern.charAt(1));
        search(source, s, pattern, p);

    }


    // Method search "pattern' in string "source"
    private static void search(String source, int s, String pattern, int p) {

        if (p > s) {

            System.out.println("Такой подстроки(шаблона) в строке точно нет!");

        } else {

            int patternHash = 0;
            int asterikPosition = 0;
            int windowsHash = 0;

            int[] found = new int[s];
            for (int i = 0; i < s; i++) {
                found[i] = 2 * s; // заполним массив числом тк если шаблон b*b будет в начале строки
                // то в пустой массив found будет добавлено значение 0 в ячейку с индексом 0
            }


            for (int i = 0; i < p; i++) {
                if (pattern.charAt(i) == '*') {
                    asterikPosition = i;

                    //the sum of the character codes in the pattern, excluding *
                } else {
                    char ch = pattern.charAt(i); // This gives the character 'i'
                    patternHash = patternHash + (int) ch;
                }

            }



            for (int start = 0; start < (s - p + 1); start++) {

                if (start == 0) {

                    for (int i = 0; i < p; i++) {

                        char ch1 = source.charAt(i);
                        windowsHash = windowsHash + (int) ch1;

                    }

                    char ch2 = source.charAt(asterikPosition);
                    windowsHash = windowsHash - (int) ch2;


                } else {

                    char ch3 = source.charAt(start - 1);
                    windowsHash = windowsHash - (int) ch3;

                    char ch4 = source.charAt(start + p - 1);
                    windowsHash = windowsHash + (int) ch4;

                    char ch5 = source.charAt(start + asterikPosition);
                    windowsHash = windowsHash - (int) ch5;

                }

                if (windowsHash == patternHash) {

                    for (int i = 0; i < p; i++) {

                        if (pattern.charAt(i) != '*' && source.charAt(start + i) != pattern.charAt(i)) {
                            //не подходит

                        } else {
                            //      если подошёл, то добавим start в found
                            found[start] = start;
                        }

                    }

                }
                char ch6 = source.charAt(start + asterikPosition);
                windowsHash = windowsHash + (int) ch6;

            }

            // Method of displaying the Arrays on the screen
            System.out.println("Подстроки, которые подходят под этот шаблон:");
            for (int i = 0; i < found.length; i++) {
                if (found[i] != (2 * s)) {

                    for (int j = i; j < (i + p); j++) {
                        System.out.print(source.charAt(j));
                    }

                    System.out.println(" - начинается на позиции " + found[i]);

                }

            }

        }

    }


}


/*

Рабин-Карп с шаблонами
Давайте применим упрощённый алгоритм Рабина-Карпа для поиска подстроки в строке, но теперь в шаблоне будет один спец-символ *, который будет означать, что подойдёт любая буква.

Давайте рассмотрим на примере. Строка, в которой будем искать: Alibaba or Alibubab? I do not know!. В качестве шаблона возьмём b*b. Есть три подстроки, который подойдёт под этот шаблон: bab (начинается на позиции 3), bub (начинается на позиции 14) и второй bab (начинается на позиции 16).

Давайте для этого модифицируем алгоритм Рабина-Карпа. Мы всё ещё будем использовать упрощённую версию, где в качестве хеша считаем просто сумму кодов символов. В чём же будет состоять модификация? Вместо того чтобы считать хеш на всём шаблоне и сравнивать его с хешами на всех символов очередного кандидата на найденную подстроку, будем считать хеш на всём шаблоне без учёта символа *, а из хеша кандидата вычитать код символа, который стоит на позиции, соответствующей позиции * в шаблоне. Также при равенстве хешей мы будем проверять на ревенство все символы, пропуская позицию с *, тк в неё подойдёт любой символ текста.

Заметим, что тогда если есть подстрока, подходящая под шаблон, то хеш шаблона и хеш кандидата будут совпадать. Также, ничего нам не мешает всё также динамично поддерживать хеш кандидата, подсчитывая его из хеша предыдущего кандидата за O(1). Итоговая асимптотика будет такая же, как и у обычного Рабина-Карпа.

def search(source, pattern):
  if pattern короче source:
    return Такой подстроки точно нет!
  found = []
  pattern_hash = сумма кодов символов в pattern без учёта *
  asterik_position = позиция '*' в pattern
  for start от 0 до длина(source) - длина(pattern) + 1
    if start == 0:
      window_hash = сумма кодов первых длина(pattern) символов source
      window_hash -= код символа в source на позиции asterik_position
    else:
      window_hash -= код символа в source на позиции start-1
      window_hash += код символа в source на позиции start+длина(pattern) - 1
      window_hash -= код символа в source на позиции start+asterik_position
    if window_hash == pattern_hash:
      for i от 0 до длина(pattern):
        if pattern[i] != '*' И source[start + i] != pattern[i]:
          не подходит
      если подошёл, то добавим start в found
    window_hash += код символа в source на позиции start+asterik_position
  return found

 */