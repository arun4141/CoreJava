package inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestEmployee1 {
public static void main(String[] args) throws Exception {
	
	FileOutputStream F = new FileOutputStream("C:\\Users\\admin\\Desktop\\New folder (2)\\qwer.txt");
	ObjectOutputStream out = new ObjectOutputStream(F);
	
	Employee E = new Employee(0, "Shri Guru Charan Sarooja-raj\r\n" + 
			"\r\n" + 
			"Nija manu Mukura Sudhaari\r\n" + 
			"\r\n" + 
			"Baranau Rahubhara Bimala Yashu\r\n" + 
			"\r\n" + 
			"Jo Dayaka Phala Chari\r\n" + 
			"\r\n" + 
			"Budhee-Heen Thanu Jannikay\r\n" + 
			"\r\n" + 
			"Sumirow Pavana Kumara\r\n" + 
			"\r\n" + 
			"Bala-Budhee Vidya Dehoo Mohee\r\n" + 
			"\r\n" + 
			"Harahu Kalesha Vikaara...", "Jai Hanuman gyan gun sagar\r\n" + 
					"\r\n" + 
					"Jai Kapis tihun lok ujagar\r\n" + 
					"\r\n" + 
					"Ram doot atulit bal dhama\r\n" + 
					"\r\n" + 
					"Anjaani-putra Pavan sut nama...\r\n" + 
					"\r\n" + 
					"Mahabir Bikram Bajrang\r\n" + 
					"\r\n" + 
					"Kumati nivar sumati Ke sangi\r\n" + 
					"\r\n" + 
					"Kanchan varan viraj subesa\r\n" + 
					"\r\n" + 
					"Kanan Kundal Kunchit Kesh\r\n" + 
					"\r\n" + 
					"Hath Vajra Aur Dhuvaje Viraj\r\n" + 
					"\r\n" + 
					"Kaandhe moonj janehu sajai\r\n" + 
					"\r\n" + 
					"Sankar suvan kesri Nandan\r\n" + 
					"\r\n" + 
					"Tej prataap maha jag vandan...\r\n" + 
					"\r\n" + 
					"Vidyavaan guni ati chatur\r\n" + 
					"\r\n" + 
					"Ram kaj karibe ko aatur\r\n" + 
					"\r\n" + 
					"Prabu charitra sunibe-ko rasiya\r\n" + 
					"\r\n" + 
					"Ram Lakhan Sita man Basiya\r\n" + 
					"\r\n" + 
					"Sukshma roop dhari Siyahi dikhava\r\n" + 
					"\r\n" + 
					"Vikat roop dhari lank jarava\r\n" + 
					"\r\n" + 
					"Bhima roop dhari asur sanghare\r\n" + 
					"\r\n" + 
					"Ramachandra ke kaj sanvare...\r\n" + 
					"\r\n" + 
					"Laye Sanjivan Lakhan Jiyaye\r\n" + 
					"\r\n" + 
					"Shri Raghuvir Harashi ur laye\r\n" + 
					"\r\n" + 
					"Raghupati Kinhi bahut badai\r\n" + 
					"\r\n" + 
					"Tum mam priye Bharat-hi-sam bhai\r\n" + 
					"\r\n" + 
					"Sahas badan tumharo yash gaave\r\n" + 
					"\r\n" + 
					"Asa-kahi Shripati kanth lagaave\r\n" + 
					"\r\n" + 
					"Sankadhik Brahmaadi Muneesa\r\n" + 
					"\r\n" + 
					"Narad-Sarad sahit Aheesa...\r\n" + 
					"\r\n" + 
					"Yam Kuber Digpaal Jahan te\r\n" + 
					"\r\n" + 
					"Kavi kovid kahi sake kahan te\r\n" + 
					"\r\n" + 
					"Tum upkar Sugreevahin keenha\r\n" + 
					"\r\n" + 
					"Ram milaye rajpad deenha\r\n" + 
					"\r\n" + 
					"Tumharo mantra Vibheeshan maana\r\n" + 
					"\r\n" + 
					"Lankeshwar Bhaye Sub jag jana\r\n" + 
					"\r\n" + 
					"Yug sahastra jojan par Bhanu\r\n" + 
					"\r\n" + 
					"Leelyo tahi madhur phal janu...\r\n" + 
					"\r\n" + 
					"Prabhu mudrika meli mukh mahee\r\n" + 
					"\r\n" + 
					"Jaladhi langhi gaye achraj nahee\r\n" + 
					"\r\n" + 
					"Durgaam kaj jagath ke jete\r\n" + 
					"\r\n" + 
					"Sugam anugraha tumhre tete\r\n" + 
					"\r\n" + 
					"Ram dwaare tum rakhvare\r\n" + 
					"\r\n" + 
					"Hoat na agya binu paisare\r\n" + 
					"\r\n" + 
					"Sub sukh lahae tumhari sar na\r\n" + 
					"\r\n" + 
					"Tum rakshak kahu ko dar naa...\r\n" + 
					"\r\n" + 
					"Aapan tej samharo aapai\r\n" + 
					"\r\n" + 
					"Teenhon lok hank te kanpai\r\n" + 
					"\r\n" + 
					"Bhoot pisaach Nikat nahin aavai\r\n" + 
					"\r\n" + 
					"Mahavir jab naam sunavae\r\n" + 
					"\r\n" + 
					"Nase rog harae sab peera\r\n" + 
					"\r\n" + 
					"Japat nirantar Hanumant beera\r\n" + 
					"\r\n" + 
					"Sankat se Hanuman chudavae\r\n" + 
					"\r\n" + 
					"Man Karam Vachan dyan jo lavai...\r\n" + 
					"\r\n" + 
					"Sab par Ram tapasvee raja\r\n" + 
					"\r\n" + 
					"Tin ke kaj sakal Tum saja\r\n" + 
					"\r\n" + 
					"Aur manorath jo koi lavai\r\n" + 
					"\r\n" + 
					"Sohi amit jeevan phal pavai\r\n" + 
					"\r\n" + 
					"Charon Yug partap tumhara\r\n" + 
					"\r\n" + 
					"Hai persidh jagat ujiyara\r\n" + 
					"\r\n" + 
					"Sadhu Sant ke tum Rakhware\r\n" + 
					"\r\n" + 
					"Asur nikandan Ram dulhare...\r\n" + 
					"\r\n" + 
					"Ashta-sidhi nav nidhi ke dhata\r\n" + 
					"\r\n" + 
					"As-var deen Janki mata\r\n" + 
					"\r\n" + 
					"Ram rasayan tumhare pasa\r\n" + 
					"\r\n" + 
					"Sada raho Raghupati ke dasa\r\n" + 
					"\r\n" + 
					"Tumhare bhajan Ram ko pavai\r\n" + 
					"\r\n" + 
					"Janam-janam ke dukh bisraavai\r\n" + 
					"\r\n" + 
					"Anth-kaal Raghuvir pur jayee\r\n" + 
					"\r\n" + 
					"Jahan janam Hari-Bakht Kahayee...\r\n" + 
					"\r\n" + 
					"Aur Devta Chit na dharehi\r\n" + 
					"\r\n" + 
					"Hanumanth se hi sarve sukh karehi\r\n" + 
					"\r\n" + 
					"Sankat kate-mite sab peera\r\n" + 
					"\r\n" + 
					"Jo sumirai Hanumat Balbeera\r\n" + 
					"\r\n" + 
					"Jai Jai Jai Hanuman Gosahin\r\n" + 
					"\r\n" + 
					"Kripa Karahu Gurudev ki nyahin\r\n" + 
					"\r\n" + 
					"Jo sat bar path kare koyi\r\n" + 
					"\r\n" + 
					"Chutehi bandhi maha sukh hoyi...\r\n" + 
					"\r\n" + 
					"Jo yah padhe Hanuman Chalisa\r\n" + 
					"\r\n" + 
					"Hoye siddhi sakhi Gaureesa\r\n" + 
					"\r\n" + 
					"Tulsidas sada hari chera\r\n" + 
					"\r\n" + 
					"Keejai Nath Hridaye mein dera...\r\n" + 
					"\r\n" + 
					"Keejai Nath Hridaye mein dera...\r\n" + 
					"\r\n" + 
					"Pavan Tanay Sankat Harana,\r\n" + 
					"\r\n" + 
					"Mangala Murati Roop...\r\n" + 
					"\r\n" + 
					"Ram Lakhana Sita Sahita\r\n" + 
					"\r\n" + 
					"Hriday Basahu Soor Bhoop");
	
	out.writeObject(E);
	out.close();
	System.out.println("done");
	System.out.println("----");
	
}
}
