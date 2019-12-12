# QA-Testes-Automatizados




## Testes WebJumb


## Ferramentas Utilizada.

   ##### _Instalar todas abaixo._

 - Eclpse Version: 2019-09 R (4.13.0)
 - Plugin do Cucumber(Instalado dentro do Eclipse)
 - JDK 8
 - chromedriver


## Linguagem 

 - Java


# Instruções para executar os testes.

 - Quando for executar os testes verificar antes o caminho do driver.
   Verificar na pacote Suporte a classe Browser nela estar definido o caminho.
   No caso está defenido como "target\\Driver\\chromedriver.exe", a pasta 'Driver' foi criada dentro da pasta 'target',
   caso quando for clonar pode ser que a pasta não existe. Então criá-lo.
   
 - A pasta 'screenshot' talvez ao clonar o projeto não existe e só criar dentro da pasta 'target'. Pasta para armazenar
   o print da tela.
  
 - Instalar o plugin Cucumber dentro do Eclipse em HELP > ECLIPSE MARKETPlACE e pesquisar cucumber e clicar em install.
 
 - Todas as dependências necessárias estão no arquivo pom.xml, ao abrir e salvar as dependências serão instalada automaticamente.
   
 - Baixar o chromedriver e coolocar na pasta Driver ou então colocar na pasta desejável, so definir o caminho do driver
   na classe Browser.
 
 
 - Dentro do pacote TesteWebJump.runner contém a classe Runner.
   Executar a classe Runner para executar os testes.
