fun coletarDados() {
    var continuar = true

    while (continuar) {
        println("Calculadora do Índice de Massa Corporal (IMC)")

        println("Digite o seu peso em kg (Ex: 80.5): ")
        val peso = readLine()?.toDoubleOrNull()
        println("Digite a sua altura em metros(Ex: 1.8): ")
        val altura = readLine()?.toDoubleOrNull()

        if (peso == null || altura == null) {
            println("ERRO!")
            continue
        }

        val IMC = peso / (altura * altura)
        val IMCFormat = "%.2f".format(IMC)

        val calculoimc = when {
            IMC < 18.5 -> "Excesso de Magreza"
            18.5 <= IMC && IMC < 25 -> "Peso Normal"
            25 <= IMC && IMC < 30 -> "Excesso de Peso"
            30 <= IMC && IMC < 35 -> "Obesidade - Grau 1"
            35 <= IMC && IMC < 40 -> "Obesidade - Grau 2"
            IMC >= 40 -> "Obesidade - Grau 3"
            else -> {
                println("ERRO!")
                continue
            }
        }

        println("Seu IMC é $IMCFormat. Isso significa $calculoimc")

        println("Deseja fazer um novo cálculo? S para Sim, N para Não")
        val resposta = readLine()

        if (resposta == "S" || resposta == "s") {
            continuar = true
        } else if (resposta == "N" || resposta == "n") {
            println("Obrigado por utilizar a cálculadora!!!")
            continuar = false
        } else {
            println("Opção Inválida!")
        }
    }
}

fun main() {
    coletarDados()
}

