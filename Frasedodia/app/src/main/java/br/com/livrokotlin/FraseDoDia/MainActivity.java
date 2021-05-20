package br.com.livrokotlin.FraseDoDia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void gerarNovaFrase(View view) {

                String[] frase = {

                        "A persistência é o caminho do êxito.",
                        "Lute. Acredite. Conquiste. Perca. Deseje. Espere. Alcance. Invada. Caia. Seja tudo o quiser ser, mas acima de tudo, seja você sempre.",
                        "Só existe um êxito: a capacidade de levar a vida que se quer.",
                        "A vitalidade é demonstrada não apenas pela persistência, mas pela capacidade de começar de novo.",
                        "A coragem não é ausência do medo; é a persistência apesar do medo.",
                        "Só se pode alcançar um grande êxito quando nos mantemos fiéis a nós mesmos.",
                        "O sucesso nasce do querer, da determinação e persistência em se chegar a um objetivo. Mesmo não atingindo o alvo, quem busca e vence obstáculos, no mínimo fará coisas admiráveis.",
                        "Determinação, coragem e autoconfiança são fatores decisivos para o sucesso. Se estamos possuídos por uma inabalável determinação, conseguiremos superá-los. Independentemente das circunstâncias, devemos ser sempre humildes, recatados e despidos de orgulho.",
                        "Agir, eis a inteligência verdadeira. Serei o que quiser. Mas tenho que querer o que for. O êxito está em ter êxito, e não em ter condições de êxito. Condições de palácio tem qualquer terra larga, mas onde estará o palácio se não o fizerem ali?",
                        "Só se pode alcançar um grande êxito quando nos mantemos fiéis a nós mesmos.",
                        "O homem não teria alcançado o possível se, repetidas vezes, não tivesse tentado o impossível.",
                        "Todo mundo é capaz de sentir os sofrimentos de um amigo. Ver com agrado os seus êxitos exige uma natureza muito delicada.,",
                        "Lute com determinação, abrace a vida com paixão, perca com classe e vença com ousadia, porque o mundo pertence a quem se atreve e a vida é muito para ser insignificante.",
                        "Força de ânimo e coragem na adversidade servem para conquistar o êxito, mais do que um exército.",
                        "Uma auto-imagem forte e positiva é a melhor preparação possível para o sucesso.",
                        "Creia em si, mas não duvide sempre dos outros.",
                        "Dois homens não podem passar meia hora juntos sem que um conquiste uma evidente superioridade em relação ao outro.",
                        "Não deixe que as pessoas te façam desistir daquilo que você mais quer na vida. Acredite. Lute. Conquiste. E acima de tudo, seja feliz!",
                        "Talento é dom, é graça. E sucesso nada tem a ver com sorte, mas com determinação e trabalho.",
                        "As únicas grandes companhias que conseguirão ter êxito são aquelas que consideram os seus produtos obsoletos antes que os outros o façam.",
                        "Para ter um negócio de sucesso, alguém, algum dia, teve que tomar uma atitude de coragem.",
                        "Apesar dos nossos defeitos, precisamos enxergar que somos pérolas únicas no teatro da vida e entender que não existem pessoas de sucesso ou pessoas fracassadas. O que existe são pessoas que lutam pelos seus sonhos ou desistem deles.",
                        "Jamais desista das pessoas que ama. Jamais desista de ser feliz. Lute sempre pelos seus sonhos. Seja profundamente apaixonado pela vida. Pois a vida é um espetáculo imperdível.",
                        "VOCÊ É DO TAMANHO DOS SEUS SONHOS! Lute, persista, insista, corra atrás, passe algumas noites sem dormir direito, mas nunca desista de seus sonhos, acredite que é capaz, se olhe no espelho e diga pra você: VOCÊ TEM POTENCIAL! Ninguém além de você mesmo pode torná-lo real.",
                        "Sonhe, lute, corra atrás, realize. Mas nunca desista, pois nada é impossível quando temos força, foco e fé.",
                        "Não dê ouvidos a pessoas negativas. As neuroses de pessoas assim asfixiam a alma. Lute pelos seus sonhos. E desistir? Nem pensar!Acredite primeiro que Deus é por você e depois acredite no seu potencial.",
                        "Mundo vão e vulgar, em que pessoas preferem buscar seus prazeres momentâneos a lutar por seus sonhos eternos! Mal sabem que os prazeres duram segundos, mas os sonhos duram para sempre!",
                        "Jamais sofra antecipadamente. Pense positivo. Acredite nos seus sonhos. Nunca desista de lutar. A vida é generosa para aqueles que acreditam nela.",
                        "Nunca esqueçam no que juntos acreditamos, nunca esqueçam de acreditar em seus sonhos, lutar por eles, nunca se esqueçam que o universo conspira e nunca se esqueçam de dar amor a qualquer pessoa que encontrem no caminho. Obrigada por fazer minha vida tão feliz, os amo para sempre.",
                        "Lute pelos sonhos, busque seus objetivos; batalhe pelos seus ideais e mostre que você é um guerreiro.",
                        "Se os seus sonhos são grandes, lute por eles, pois desistir não é bom, acredite em você mesmo, mas sempre com a certeza de que Deus é maior que todas as coisas, e com Ele todos os sonhos perdidos se tornam sonhos renovados e realizados!",
                        "Quando você diz desisto, as lutas imediatamente se acabam, porém, seus sonhos nunca se realizaram.",
                        "Lute incessantemente pelos seus sonhos, supere-se, arrisque, mas quando alcançar seu objetivo, lembre-se do preço de continuar no pódio.",
                        "Nunca abandone seus sonhos, nunca abandone seu caminho, lute por eles, mesmo que os cães ladrem.",
                        "Acredite no seu sonho, lute por ele, e quando tiver a oportunidade aproveite como se fosse um momento único em sua vida, e, acredite, ele pode não ser único, mas vai ser inesquecível.",
                        "Por menores que sejamos, devemos sempre lutar pelo que acreditamos estar certo. E eu não quero dizer lutar com o poder dos nossos punhos ou das nossas espadas... E sim com o poder de nossos cérebros e nossos pensamentos e nossos sonhos.",
                        "Nascemos para vencer, por isso lute pelos seus sonhos. Enquanto houver vontade de lutar haverá esperança de dias melhores. Lute bastante e vença sempre!"
        };
                int numero = new Random().nextInt(38);
        TextView texto = findViewById(R.id.lbl_frase);
        texto.setText(frase[numero]);

    }


    }
