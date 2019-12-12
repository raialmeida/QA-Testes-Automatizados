# QA-Testes-Automatizados




## Testes WebJumb


## Ferramentas Utilizada.

 - Eclpse Version: 2019-09 R (4.13.0)
 - Plugin do Cucumber(Instalado dentro do Eclipse)
 - JDK 8
 - chromedriver


## Linguagem 

 - Java


# Instruções para executar os teste.

 - Quando for executar os testes verificar antes o caminho do driver.
   Verificar na pacote Suporte a classe Browser nela estar definido o caminho.
   No caso está defenido como "target\\Driver\\chromedriver.exe", a pasta Driver foi criada dentro do target,
   caso quando for clonar pode ser que a pasta não existe. Então criá-lo.
  
 - Instalar o plugin Cucumber dentro do Eclipse em HELP > ECLIPSE MARKETPlACE e pesquisar cucumber e clicar em install
   
 - Baixar o chromedriver e coolocar na pasta Driver ou então colocar na pasta desejável, so definir o caminho do driver
   na classe Browser.
 
 
 - Dentro do pacote TesteWebJump.runner contém a classe Runner
   Executar a classe Runner para executar os testes.
