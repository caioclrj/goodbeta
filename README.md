# GoodBeta
Esta repositório contém artefatos referentes a entrega do Projeto Goodbeta, como explicado no post de Revisão de Escopo 
do Forum de Discussão 2, realizado por Caio Clementino Lamarão na sexta-feira, 11 abr. 2025, às 21:48.  

As entregas são:   
###### 
  1. SGDB - Artefatos do banco de dados do projeto Goodbeta - declarados em [./SGBD/README.md](./SGBD/README.md)
  
######  
  2. App - Artefatos do projeto inicialmente proposto - declarados em [./app/README.md](./app/README.md)

O aplicativo pode ser verificado clonando este repositório no Android Studio

##### Clonagem

| Passo 1                                             | Passo2                                             | Passo 3                                            | Passo 4                                            |
|:-:|:-:|:-:|:-:|
|<img src=img/android_1.jpeg width="450" height="225">|<img src=img/android_2.jpg width="450" height="225">|<img src=img/android_3.jpg width="450" height="225">|<img src=img/android_4.jpg width="450" height="225">|

**_As imagens podem ser clicadas para acesso uma melhor resolução. Para retornar ao ponto original do roteiro, navege o browser para a página anterior_**

Após a clonagem, 2 configurações adicionais são necessárias para a configuração do projeto em uso local:

##### 1. Gradle - ao instalar o Android Studio, às vezes o Gradle vem apontando o local de instalação do Android Studio como caminho default para o valor "Gradle User Home". 
Este valor deve apontar o caminho onde o projeto foi instalado / clonado. Se não houve customização da instalação do projeto, o caminho seria "C:/Users/<o usuário da sua máquina>/StudioProjects/goodbeta/.gradle"

No passo 3, acione uma montagem do projeto no botão Assemble - referenciado na imagem - aguarde o processamento. 

É esperado que ocorra uma erro de SDK, como verificado no passo 4      

| Passo 1                                             | Passo2                                             | Passo 3                                            | Passo 4                                            |
|:-:|:-:|:-:|:-:|
|<img src=img/gradle_1.jpg width="450" height="225">|<img src=img/gradle_2.jpg width="450" height="225">|<img src=img/gradle_3.jpg width="450" height="225">|<img src=img/gradle_4.jpg width="450" height="225">|

**_As imagens podem ser clicadas para acesso uma melhor resolução. Para retornar ao ponto original do roteiro, navege o browser para a página anterior_**

##### 2. SDK - o erro anterior é referente a uma arquivo, que por ter caracteristica de referencia local ao equipamento onde é clonado o projeto, não foi versionado.
Devemos cria-lo então.
No **passo 1**, copie a informação de Android SDK Location. 
- A partir do "hamburger", de acesso ao menu de opções ( menu canto superior esquerdo ) selecione o caminho de opções **File>>Settings>>Languages & Frameworks>>Android SDK**
   
No **passo 2**, crie um arquivo em **"Gradle Scripts"**: 
 - selecione um arquivo qualquer em Gradle Scripts
 - clique com botão direito. Das opções da lista suspensa escolha **New>File" com o nome **local.properties**
  
No **passo 3** cole a informação do Android SDK Location.
- deve ser incluida a informação [sdk.dir=<SDK Android Location Formatado>]. Ex.: "sdk.dir=C\:\\Users\\fernando\\AppData\\Local\\Android\\Sdk"
 
No **passo 4** deve ser realizado no Assemble - como no passo 3 do **Gradle**   

| Passo 1                                             | Passo2                                             | Passo 3                                            | Passo 4                                            |
|:-:|:-:|:-:|:-:|
|<img src=img/sdk_1.jpg width="450" height="225">|<img src=img/sdk_2.jpg width="450" height="225">|<img src=img/sdk_3.jpg width="450" height="225">|<img src=img/sdk_4.jpg width="450" height="225">|

**_As imagens podem ser clicadas para acesso uma melhor resolução. Para retornar ao ponto original do roteiro, navege o browser para a página anterior_**

 Ao fim, o build deve ocorrer sempre problemas com um warning a respeito de uma entidade não indexada - que tem o index. 
Obs.: Possível bug de interpretação de ferramenta descontinuada kapt. 
