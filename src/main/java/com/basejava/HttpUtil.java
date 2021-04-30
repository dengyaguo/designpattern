package com.basejava;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.security.RSAUtil;

import java.time.LocalDateTime;

public class HttpUtil {

    static String body = "[{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:42:44\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039508136309\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:42:45\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039508132750\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:42:46\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039508139206\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:42:47\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039508139820\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:42:47\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039508136183\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:42:48\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039508139433\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:42:49\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039508133015\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:42:49\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039508139911\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:42:50\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039508131520\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:42:50\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039508138883\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:42:51\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039508133082\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:42:52\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039508139080\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:42:52\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039508138861\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:42:53\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039507855932\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:42:54\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039507854860\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:42:55\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039507855807\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:42:56\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039507855794\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:42:57\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039507855410\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:42:58\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039507862415\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:42:59\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039507856300\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:43:00\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039507855841\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:43:01\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039507862608\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:43:02\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039507855772\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:43:03\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039507862460\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:43:04\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039507856504\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:43:07\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039507856413\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:43:07\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039507854804\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:43:09\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039507862391\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:43:10\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039507862142\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:43:11\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039507862722\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:43:11\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039507862448\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:43:12\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039507856526\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1},{\"carNumber\":\"\",\"customerId\":258979,\"customerName\":\"洁馨日化洗护家居店\",\"isProtocol\":1,\"listId\":\"572811020210428093706381\",\"nextStopCode\":\"0728002\",\"nextStopId\":6139,\"nextStopName\":\"仙桃集散点\",\"salesmanCode\":\"00101031\",\"salesmanContact\":\"13377931390\",\"salesmanId\":151836,\"salesmanName\":\"胡建华\",\"scanNetworkCity\":\"仙桃市\",\"scanNetworkContact\":\"13035352082\",\"scanNetworkProvince\":\"湖北省\",\"scanNetworkTypeId\":336,\"scanNetworkTypeName\":\"网点\",\"scanPda\":\"daa5476bf54c9eee592794af708e0ca4\",\"scanTime\":\"2021-04-28 09:43:13\",\"taskCode\":\"ZXZB21039215331\",\"transportTypeCode\":\"02\",\"transportTypeId\":22,\"transportTypeName\":\"公路运输\",\"waybillId\":\"JT5039507856399\",\"waybillInputType\":1,\"weight\":0.1,\"weightFlag\":1}]";
    static  String privateKey = "MIIBVAIBADANBgkqhkiG9w0BAQEFAASCAT4wggE6AgEAAkEAmN6IQFQTAdX3EnlfEOrifV2vpzKtXWIvopUzt+w6crWblt/U3jKTqia2lCyRFuG3Yq7Qo8ONWmRStxYgKZj8WQIDAQABAkAi/aTgXJ4xKGGyd9ebzrfjDEO9mKr4GhZfN5mr+sVyJeYhOCSxD73FzvPWBfAFNfF8Tdfx04jZD7eljrpz3b2RAiEA5JyHuHiQNe66EQW/clmkGF8UvOrb86EDp1PtojhXcbUCIQCrLwD1czGmsegSF/GzkK7oRayJppXPm13kjVrVyR1WlQIhANHLsGWjBrzn0wtyGeonx4ayIwboBWgEOKUjSW3YhK8NAiA1KjoAATDQdrx+shUNEchgtxLpBWXNvpEgpI4ri3SjKQIgELA6pwG0ANsUhmWNVziPN4IqBOQzMkck7MnAMuVpaAI=";

    static  String publicKey = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAJjeiEBUEwHV9xJ5XxDq4n1dr6cyrV1iL6KVM7fsOnK1m5bf1N4yk6omtpQskRbht2Ku0KPDjVpkUrcWICmY/FkCAwEAAQ==";

    public static void main(String[] args) throws Exception {
/*        String fdafdafd = RSAUtil.encryptByPri("fdafdafd", privateKey);
        String signature = RSAUtil.decryptByPub(fdafdafd, publicKey);*/

        String signature = RSAUtil.decryptByPub("Js7UNO362XI02xA3oGWjlSl/0ZO2kFP8lyDS7ADVG5pdfT+AmQXFbTi5SdWwUFxN28FX2OPbeJmL42a4aj8Azw==", publicKey);
        long currentTimeMillis = System.currentTimeMillis();
        String digest = MD5Utils.getMD5Str(body  + currentTimeMillis + signature);
        System.out.println(digest);
        HttpResponse authToken =
                 HttpRequest.post("localhost:8910/bc/scanList/uploadSigningData")
                .body( body )
                .header("authToken", "1b492526992d4cc8a67d323a9ba76aee")
                .header("digestv", digest)
                .header("timeEpoch", ""+currentTimeMillis)
                .header("App-Version", "1.0.80")
                .header("User-Agent", "xxx/app_in")
                .execute();
        String body = authToken.body();
    }
}
