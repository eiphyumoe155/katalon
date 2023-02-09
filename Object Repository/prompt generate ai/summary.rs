<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>summary</name>
   <tag></tag>
   <elementGuidId>aeb3a0f4-1bfd-4070-a08e-601ffbe93323</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;access_token\&quot; : \&quot;yyy\&quot;,\n    \&quot;p_id\&quot; : \&quot;${process_id}\&quot;, \n    \&quot;article_id\&quot; : \&quot;c0abd11b3241\&quot;,\n    \&quot;text\&quot;: \&quot;方法今流行りのおしゃれなヘアスタイル！ボブ・トレンドを顔型別におすすめします。ボブは女性らしい美しいシルエットを作り出すことで、自分らしさを引き立てるヘアスタイルでもあります。特に、最近の注目度が高くなっているのが「ミディアム・ボブ」です。このミディアム・ボブは可愛らしさと大人っぽさを併せ持つキュートな雰囲気が特徴的で、顔型に合わせて着こなすことでオシャレ度UP間違いなし！今回は、幅広い顔型に対応可能なミディアム・ボブの着こなし方法と、簡単に決めるコツを紹介します。 ラウンドフェイスの髪型の場合は、少々立体的な形のカットがオススメ！リーズナブルで前髪の長さも調整可能だから安心♪ 小顔の髪型の場合は、サイドから外側にかかる重厚感あるカットがオススメ！目元周りを上手く隠れてくれるので小顔効果UP間違いナシ！ それと逆に大きめの顔の場合は、内側から外側まで浅く伸ばしたカットがオススメ！バランスよく軽快感のあるヘアースタイルに仕上がります。 またミディアム・ボブの魅力的な部分はクセの出来具合も決定打？うっとり綺麗なラグジュアリー感をプラス♪ 縦パーツも好き勝手に出来上がって視線の注目を集めてきます＾＾ どんなヘアーストイルも自由自在♪ バリエーション豊富の完成度の高いミディアム・ボブを是非トライしてみて下さい☆ \&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>a30b6fe3-a598-486f-a307-56d3bb1c251a</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://localhost:3000/task_generate_summary</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
