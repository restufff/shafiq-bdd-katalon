Feature: Daftar Atas Nama Individu
  

  @Valid
  Scenario Outline: Daftar akun baru dengan pilihan 'Daftar Atas Nama Individu' menggunakan user yang valid 
    Given User go to <site>
    When User in landing page
    And User click button Daftar
    And User click button Daftar Atas Nama Individu
    And User input nama lengkap <namaLengkap>
		And User input email <email>
		And User input kata sandi	<kataSandi>
		And User input konfirmasi kata sandi <konfirmasiKataSandi>
		And User choose dari mana anda mengetahui shafiq?
		And User click captcha
		And User click button Daftar Terakhir
		And User click checkbox syarat dan ketentuan
		And User click button setujui
		Then User success register
    

    Examples: 
      | site  									| namaLengkap |	email										| kataSandi				| konfirmasiKataSandi	 	|
      | https://www.shafiq.id/	| Restu Fauzi	|	mabuchikou3@gmail.com		| testerPertama1	|	testerPertama1				| 