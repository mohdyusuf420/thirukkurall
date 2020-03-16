package com.mafyusuf.thirukkualaalayam;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity  {

    ListView lv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent(MainActivity.this,thirukkurals.class);
                    startActivity( intent );
                }
                else if(position==1){
                    Intent intent = new Intent(MainActivity.this,thirukural_2.class);
                    startActivity( intent );
                }
                else if(position==2){
                    Intent intent = new Intent(MainActivity.this,thirukural_3.class);
                    startActivity( intent );
                }
                else if(position==3){
                    Intent intent = new Intent(MainActivity.this,thiru_4.class);
                    startActivity( intent );
                }
                else if(position==4){
                    Intent intent = new Intent(MainActivity.this,thiru_5.class);
                    startActivity( intent );
                }
                else if(position==5){
                    Intent intent = new Intent(MainActivity.this,thiru_6.class);
                    startActivity( intent );
                }
                else if(position==6){
                    Intent intent = new Intent(MainActivity.this,thiru_7.class);
                    startActivity( intent );
                }
                else if(position==7){
                    Intent intent = new Intent(MainActivity.this,thiru_8.class);
                    startActivity( intent );
                }
                else if(position==8){
                    Intent intent = new Intent(MainActivity.this,thiru_9.class);
                    startActivity( intent );
                }
                else if(position==9){
                    Intent intent = new Intent(MainActivity.this,thiru_10.class);
                    startActivity( intent );
                }else if(position==10){
                    Intent intent = new Intent(MainActivity.this,thiru_11.class);
                    startActivity( intent );
                }else if(position==11){
                    Intent intent = new Intent(MainActivity.this,thiru_12.class);
                    startActivity( intent );
                }else if(position==12){
                    Intent intent = new Intent(MainActivity.this,thiru_13.class);
                    startActivity( intent );
                }else if(position==13){
                    Intent intent = new Intent(MainActivity.this,thiru_14.class);
                    startActivity( intent );
                }else if(position==14){
                    Intent intent = new Intent(MainActivity.this,thiru_15.class);
                    startActivity( intent );
                }else if(position==15){
                    Intent intent = new Intent(MainActivity.this,thiru_16.class);
                    startActivity( intent );
                }else if(position==16) {
                    Intent intent = new Intent( MainActivity.this, thiru_17.class );
                    startActivity( intent );
                }
                else if(position==17){
                    Intent intent = new Intent(MainActivity.this,thiru_18.class);
                    startActivity( intent );
                }
                else if(position==18){
                    Intent intent = new Intent(MainActivity.this,thiru_19.class);
                    startActivity( intent );
                }
                else if(position==19){
                    Intent intent = new Intent(MainActivity.this,thiru_20.class);
                    startActivity( intent );
                }
                else if(position==20){
                    Intent intent = new Intent(MainActivity.this,thiru_21.class);
                    startActivity( intent );
                }
                else if(position==21){
                    Intent intent = new Intent(MainActivity.this,thiru_22.class);
                    startActivity( intent );
                }else if(position==22){
                    Intent intent = new Intent(MainActivity.this,thiru_23.class);
                    startActivity( intent );
                }else if(position==23){
                    Intent intent = new Intent(MainActivity.this,thiru_24.class);
                    startActivity( intent );
                }else if(position==24){
                    Intent intent = new Intent(MainActivity.this,thiru_25.class);
                    startActivity( intent );
                }else if(position==25){
                    Intent intent = new Intent(MainActivity.this,thiru_26.class);
                    startActivity( intent );
                }else if(position==26){
                    Intent intent = new Intent(MainActivity.this,thiru_27.class);
                    startActivity( intent );
                }else if(position==27){
                    Intent intent = new Intent(MainActivity.this,thiru_28.class);
                    startActivity( intent );
                }else if(position==28) {
                    Intent intent = new Intent( MainActivity.this, thiru_29.class );
                    startActivity( intent );
                }
            else if(position==29){
                Intent intent = new Intent(MainActivity.this,thiru_30.class);
                startActivity( intent );
            }
                else if(position==30){
                    Intent intent = new Intent(MainActivity.this,thiru_31.class);
                    startActivity( intent );
                }
                else if(position==31){
                    Intent intent = new Intent(MainActivity.this,thiru_32.class);
                    startActivity( intent );
                }

                else if(position==32){
                    Intent intent = new Intent(MainActivity.this,thiru_33.class);
                    startActivity( intent );
                }else if(position==33){
                    Intent intent = new Intent(MainActivity.this,thiru_34.class);
                    startActivity( intent );
                }else if(position==34){
                    Intent intent = new Intent(MainActivity.this,thiru_35.class);
                    startActivity( intent );
                }else if(position==35){
                    Intent intent = new Intent(MainActivity.this,thiru_36.class);
                    startActivity( intent );
                }else if(position==36){
                    Intent intent = new Intent(MainActivity.this,thiru_37.class);
                    startActivity( intent );
                }else if(position==37){
                    Intent intent = new Intent(MainActivity.this,thiru_38.class);
                    startActivity( intent );
                }else if(position==38){
                    Intent intent = new Intent(MainActivity.this,thiru_39.class);
                    startActivity( intent );
                }else if(position==39) {
                    Intent intent = new Intent( MainActivity.this, thiru_40.class );
                    startActivity( intent );
                }
                else if(position==40){
                    Intent intent = new Intent(MainActivity.this,thiru_41.class);
                    startActivity( intent );
                }
                else if(position==41){
                    Intent intent = new Intent(MainActivity.this,thiru_42.class);
                    startActivity( intent );
                }
                else if(position==42){
                    Intent intent = new Intent(MainActivity.this,thiru_43.class);
                    startActivity( intent );
                }
                else if(position==43){
                    Intent intent = new Intent(MainActivity.this,thiru_44.class);
                    startActivity( intent );
                }
                else if(position==44){
                    Intent intent = new Intent(MainActivity.this,thiru_45.class);
                    startActivity( intent );
                }else if(position==45){
                    Intent intent = new Intent(MainActivity.this,thiru_46.class);
                    startActivity( intent );
                }else if(position==46){
                    Intent intent = new Intent(MainActivity.this,thiru_47.class);
                    startActivity( intent );
                }else if(position==47){
                    Intent intent = new Intent(MainActivity.this,thiru_48.class);
                    startActivity( intent );
                }else if(position==48){
                    Intent intent = new Intent(MainActivity.this,thiru_49.class);
                    startActivity( intent );
                }else if(position==49){
                    Intent intent = new Intent(MainActivity.this,thiru_50.class);
                    startActivity( intent );
                }else if(position==50){
                    Intent intent = new Intent(MainActivity.this,thiru_51.class);
                    startActivity( intent );
                }else if(position==51) {
                    Intent intent = new Intent( MainActivity.this, thiru_52.class );
                    startActivity( intent );
                }
                else if(position==52){
                    Intent intent = new Intent(MainActivity.this,thiru_53.class);
                    startActivity( intent );
                }
                else if(position==53){
                    Intent intent = new Intent(MainActivity.this,thiru_54.class);
                    startActivity( intent );
                }
                else if(position==54){
                    Intent intent = new Intent(MainActivity.this,thiru_55.class);
                    startActivity( intent );
                }
                else if(position==55){
                    Intent intent = new Intent(MainActivity.this,thiru_56.class);
                    startActivity( intent );
                }else if(position==56) {
                    Intent intent = new Intent( MainActivity.this, thiru_57.class );
                    startActivity( intent );
                }
                else if(position==57){
                    Intent intent = new Intent(MainActivity.this,thiru_58.class);
                    startActivity( intent );
                }
                else if(position==58){
                    Intent intent = new Intent(MainActivity.this,thiru_59.class);
                    startActivity( intent );
                }
                else if(position==59){
                    Intent intent = new Intent(MainActivity.this,thiru_60.class);
                    startActivity( intent );
                }
                else if(position==60) {
                    Intent intent = new Intent( MainActivity.this, thiru_61.class );
                    startActivity( intent );
                }
                else if(position==61){
                    Intent intent = new Intent(MainActivity.this,thiru_62.class);
                    startActivity( intent );
                }
                else if(position==62){
                    Intent intent = new Intent(MainActivity.this,thiru_63.class);
                    startActivity( intent );
                }
                else if(position==63){
                    Intent intent = new Intent(MainActivity.this,thiru_64.class);
                    startActivity( intent );
                }
                else if(position==64){
                    Intent intent = new Intent(MainActivity.this,thiru_65.class);
                    startActivity( intent );
                }else if(position==65) {
                    Intent intent = new Intent( MainActivity.this, thiru_66.class );
                    startActivity( intent );
                }
                else if(position==66){
                    Intent intent = new Intent(MainActivity.this,thiru_67.class);
                    startActivity( intent );
                }
                else if(position==67){
                    Intent intent = new Intent(MainActivity.this,thiru_68.class);
                    startActivity( intent );
                }
                else if(position==68){
                    Intent intent = new Intent(MainActivity.this,thiru_69.class);
                    startActivity( intent );
                }else if(position==69) {
                    Intent intent = new Intent( MainActivity.this, thiru_70.class );
                    startActivity( intent );
                }
                else if(position==70){
                    Intent intent = new Intent(MainActivity.this,thiru_71.class);
                    startActivity( intent );
                }
                else if(position==71){
                    Intent intent = new Intent(MainActivity.this,thiru_72.class);
                    startActivity( intent );
                }
                else if(position==72){
                    Intent intent = new Intent(MainActivity.this,thiru_73.class);
                    startActivity( intent );
                }
                else if(position==73){
                    Intent intent = new Intent(MainActivity.this,thiru_74.class);
                    startActivity( intent );
                }else if(position==74) {
                    Intent intent = new Intent( MainActivity.this, thiru_75.class );
                    startActivity( intent );
                }
                else if(position==75){
                    Intent intent = new Intent(MainActivity.this,thiru_76.class);
                    startActivity( intent );
                }
                else if(position==76){
                    Intent intent = new Intent(MainActivity.this,thiru_77.class);
                    startActivity( intent );
                }
                else if(position==77){
                    Intent intent = new Intent(MainActivity.this,thiru_78.class);
                    startActivity( intent );
                }
                else if(position==78){
                    Intent intent = new Intent(MainActivity.this,thiru_79.class);
                    startActivity( intent );
                }
                else if(position==79){
                    Intent intent = new Intent(MainActivity.this,thiru_80.class);
                    startActivity( intent );
                }

                else if(position==80){
                    Intent intent = new Intent(MainActivity.this,thiru_81.class);
                    startActivity( intent );
                }
                else if(position==81){
                    Intent intent = new Intent(MainActivity.this,thiru_82.class);
                    startActivity( intent );
                }
                else if(position==82){
                    Intent intent = new Intent(MainActivity.this,thiru_83.class);
                    startActivity( intent );
                }
                else if(position==83){
                    Intent intent = new Intent(MainActivity.this,thiru_84.class);
                    startActivity( intent );
                }else if(position==84) {
                    Intent intent = new Intent( MainActivity.this, thiru_85.class );
                    startActivity( intent );
                }
                else if(position==85){
                    Intent intent = new Intent(MainActivity.this,thiru_86.class);
                    startActivity( intent );
                }
                else if(position==86){
                    Intent intent = new Intent(MainActivity.this,thiru_87.class);
                    startActivity( intent );
                }
                else if(position==87){
                    Intent intent = new Intent(MainActivity.this,thiru_88.class);
                    startActivity( intent );
                }
                else if(position==88){
                    Intent intent = new Intent(MainActivity.this,thiru_89.class);
                    startActivity( intent );
                }
                else if(position==89){
                    Intent intent = new Intent(MainActivity.this,thiru_90.class);
                    startActivity( intent );
                }else if(position==90){
                    Intent intent = new Intent(MainActivity.this,thiru_91.class);
                    startActivity( intent );
                }
                else if(position==91){
                    Intent intent = new Intent(MainActivity.this,thiru_92.class);
                    startActivity( intent );
                }
                else if(position==92){
                    Intent intent = new Intent(MainActivity.this,thiru_93.class);
                    startActivity( intent );
                }
                else if(position==93){
                    Intent intent = new Intent(MainActivity.this,thiru_94.class);
                    startActivity( intent );
                }else if(position==94) {
                    Intent intent = new Intent( MainActivity.this, thiru_95.class );
                    startActivity( intent );
                }
                else if(position==95){
                    Intent intent = new Intent(MainActivity.this,thiru_96.class);
                    startActivity( intent );
                }
                else if(position==96){
                    Intent intent = new Intent(MainActivity.this,thiru_97.class);
                    startActivity( intent );
                }
                else if(position==97){
                    Intent intent = new Intent(MainActivity.this,thiru_98.class);
                    startActivity( intent );
                }
                else if(position==98){
                    Intent intent = new Intent(MainActivity.this,thiru_99.class);
                    startActivity( intent );
                }
                else if(position==99){
                    Intent intent = new Intent(MainActivity.this,thiru_100.class);
                    startActivity( intent );
                }
                else if(position==100){
                    Intent intent = new Intent(MainActivity.this,thiru_101.class);
                    startActivity( intent );
                }
                else if(position==101){
                    Intent intent = new Intent(MainActivity.this,thiru_102.class);
                    startActivity( intent );
                }
                else if(position==102){
                    Intent intent = new Intent(MainActivity.this,thiru_103.class);
                    startActivity( intent );
                }
                else if(position==103){
                    Intent intent = new Intent(MainActivity.this,thiru_104.class);
                    startActivity( intent );
                }else if(position==104) {
                    Intent intent = new Intent( MainActivity.this, thiru_105.class );
                    startActivity( intent );
                }
                else if(position==105){
                    Intent intent = new Intent(MainActivity.this,thiru_106.class);
                    startActivity( intent );
                }
                else if(position==106){
                    Intent intent = new Intent(MainActivity.this,thiru_107.class);
                    startActivity( intent );
                }
                else if(position==107){
                    Intent intent = new Intent(MainActivity.this,thiru_108.class);
                    startActivity( intent );
                }
                else if(position==108){
                    Intent intent = new Intent(MainActivity.this,thiru_109.class);
                    startActivity( intent );
                }
                else if(position==109){
                    Intent intent = new Intent(MainActivity.this,thiru_110.class);
                    startActivity( intent );
                }

                else if(position==110){
                    Intent intent = new Intent(MainActivity.this,thiru_111.class);
                    startActivity( intent );
                }
                else if(position==111){
                    Intent intent = new Intent(MainActivity.this,thiru_112.class);
                    startActivity( intent );
                }
                else if(position==112){
                    Intent intent = new Intent(MainActivity.this,thiru_113.class);
                    startActivity( intent );
                }else if(position==113) {
                    Intent intent = new Intent( MainActivity.this, thiru_114.class );
                    startActivity( intent );
                }
                else if(position==114){
                    Intent intent = new Intent(MainActivity.this,thiru_115.class);
                    startActivity( intent );
                }
                else if(position==115){
                    Intent intent = new Intent(MainActivity.this,thiru_116.class);
                    startActivity( intent );
                }
                else if(position==116){
                    Intent intent = new Intent(MainActivity.this,thiru_117.class);
                    startActivity( intent );
                }
                else if(position==117){
                    Intent intent = new Intent(MainActivity.this,thiru_118.class);
                    startActivity( intent );
                }
                else if(position==118){
                    Intent intent = new Intent(MainActivity.this,thiru_119.class);
                    startActivity( intent );
                }
                else if(position==119){
                    Intent intent = new Intent(MainActivity.this,thiru_120.class);
                    startActivity( intent );
                }
                else if(position==120){
                    Intent intent = new Intent(MainActivity.this,thiru_121.class);
                    startActivity( intent );
                }
                else if(position==121){
                    Intent intent = new Intent(MainActivity.this,thiru_122.class);
                    startActivity( intent );
                }else if(position==122) {
                    Intent intent = new Intent( MainActivity.this, thiru_123.class );
                    startActivity( intent );
                }
                else if(position==123){
                    Intent intent = new Intent(MainActivity.this,thiru_124.class);
                    startActivity( intent );
                }
                else if(position==124){
                    Intent intent = new Intent(MainActivity.this,thiru_125.class);
                    startActivity( intent );
                }
                else if(position==125){
                    Intent intent = new Intent(MainActivity.this,thiru_126.class);
                    startActivity( intent );
                }
                else if(position==126){
                    Intent intent = new Intent(MainActivity.this,thiru_127.class);
                    startActivity( intent );
                }
                else if(position==127){
                    Intent intent = new Intent(MainActivity.this,thiru_128.class);
                    startActivity( intent );
                }
                else if(position==128) {
                    Intent intent = new Intent( MainActivity.this, thiru_129.class );
                    startActivity( intent );
                }
                else if(position==129){
                    Intent intent = new Intent(MainActivity.this,thiru_130.class);
                    startActivity( intent );
                }
                else if(position==130){
                    Intent intent = new Intent(MainActivity.this,thiru_131.class);
                    startActivity( intent );
                }
                else if(position==131){
                    Intent intent = new Intent(MainActivity.this,thiru_132.class);
                    startActivity( intent );
                }
                else if(position==132){
                    Intent intent = new Intent(MainActivity.this,thiru_133.class);
                    startActivity( intent );
                }




    }
};
        lv= (ListView)findViewById( R.id.title);
        lv.setOnItemClickListener(itemClickListener);
        }

    public void onBackPressed() {
        new AlertDialog.Builder(MainActivity.this).setIcon(android.R.drawable.ic_dialog_alert).setTitle("Exit")
                .setMessage("Are you sure you want to exit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                }).setNegativeButton("No", null).show();
    };

    }



