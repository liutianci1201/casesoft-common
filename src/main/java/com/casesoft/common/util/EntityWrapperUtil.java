package com.casesoft.common.util;/**
 * Created by aa on 2018/9/4.
 */

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.apache.poi.ss.formula.functions.T;

import java.util.List;

/**
 * @author aa
 * @date 2018/9/4 16:59
 * 实现PropertyFilter 转 EntityWrapper 的方法 *
 */
public class EntityWrapperUtil {
    public enum MatchType {
        IN, NIN, // 新增 in,not in
        ISN, ISNN, // 新增2 is null,is not null

        EQ, // Equal to
        LIKE, LIKESTART, // like '%value'
        LIKEEND, // like 'value%'
        LT, // Less To
        GT, // Greater than
        LE, GE;// //Greater than or equal to
    }
    public static void convertListFilterToWrapper(List<PropertyFilter> filterList, EntityWrapper entityWrapper){
        if(filterList.size()>0){
            for(PropertyFilter filter : filterList){
                convertFilterToWrapper(filter,entityWrapper);
            }
        }
    }

    private static void convertFilterToWrapper(PropertyFilter filter, EntityWrapper<T> entityWrapper) {
        boolean isMulti=filter.hasMultiProperties();
        String[] propertyNames;
        switch (filter.getMatchType()){
            case IN:
                if(isMulti){
                    propertyNames = filter.getPropertyNames();
                    for(int i= 0; i<propertyNames.length;i++){
                        if(i < propertyNames.length-1) {
                            entityWrapper.in(propertyNames[i], filter.getMatchValue().toString()).or();
                        }else{
                            entityWrapper.in(propertyNames[i],filter.getMatchValue().toString());
                        }
                    }
                }else {
                    entityWrapper.in(filter.getPropertyName(), filter.getMatchValue().toString());
                }
                break;
            case NIN:
                if(isMulti){
                    propertyNames = filter.getPropertyNames();
                    for(int i= 0; i<propertyNames.length;i++){
                        if(i < propertyNames.length-1) {
                            entityWrapper.notIn(propertyNames[i], filter.getMatchValue()).or();
                        }else{
                            entityWrapper.notIn(propertyNames[i],filter.getMatchValue());
                        }
                    }
                }else {
                    entityWrapper.notIn(filter.getPropertyName(), filter.getMatchValue());
                }
                break;
            case ISN:
                if(isMulti){
                    propertyNames = filter.getPropertyNames();
                    for(int i= 0; i<propertyNames.length;i++){
                        if(i < propertyNames.length-1) {
                            entityWrapper.isNull(propertyNames[i]).or();
                        }else{
                            entityWrapper.isNull(propertyNames[i]);
                        }
                    }
                }else {
                    entityWrapper.isNull(filter.getPropertyName());
                }
                break;
            case ISNN:
                if(isMulti){
                    propertyNames = filter.getPropertyNames();
                    for(int i= 0; i<propertyNames.length;i++){
                        if(i < propertyNames.length-1) {
                            entityWrapper.isNotNull(propertyNames[i]).or();
                        }else{
                            entityWrapper.isNotNull(propertyNames[i]);
                        }
                    }
                }else {
                    entityWrapper.isNotNull(filter.getPropertyName());
                }
                break;
            case EQ:
                if(isMulti){
                    propertyNames = filter.getPropertyNames();
                    for(int i= 0; i<propertyNames.length;i++){
                        if(i < propertyNames.length-1) {
                            entityWrapper.eq(propertyNames[i],filter.getMatchValue()).or();
                        }else{
                            entityWrapper.eq(propertyNames[i],filter.getMatchValue());
                        }
                    }
                }else {
                    entityWrapper.eq(filter.getPropertyName(),filter.getMatchValue());
                }
                break;
            case LIKE:
            case LIKESTART:
            case LIKEEND:
                if(isMulti){
                    propertyNames = filter.getPropertyNames();
                    for(int i= 0; i<propertyNames.length;i++){
                        if(i < propertyNames.length-1) {
                            entityWrapper.like(propertyNames[i],filter.getMatchValue().toString()).or();
                        }else{
                            entityWrapper.like(propertyNames[i],filter.getMatchValue().toString());
                        }
                    }
                }else {
                    entityWrapper.like(filter.getPropertyName(),filter.getMatchValue().toString());
                }
                break;
            case LT:
                if(isMulti){
                    propertyNames = filter.getPropertyNames();
                    for(int i= 0; i<propertyNames.length;i++){
                        if(i < propertyNames.length-1) {
                            entityWrapper.lt(propertyNames[i],filter.getMatchValue()).or();
                        }else{
                            entityWrapper.lt(propertyNames[i],filter.getMatchValue());
                        }
                    }
                }else {
                    entityWrapper.lt(filter.getPropertyName(),filter.getMatchValue());
                }
                break;
            case GT:
                if(isMulti){
                    propertyNames = filter.getPropertyNames();
                    for(int i= 0; i<propertyNames.length;i++){
                        if(i < propertyNames.length-1) {
                            entityWrapper.gt(propertyNames[i],filter.getMatchValue()).or();
                        }else{
                            entityWrapper.gt(propertyNames[i],filter.getMatchValue());
                        }
                    }
                }else {
                    entityWrapper.gt(filter.getPropertyName(),filter.getMatchValue());
                }
                break;
            case LE:
                if(isMulti){
                    propertyNames = filter.getPropertyNames();
                    for(int i= 0; i<propertyNames.length;i++){
                        if(i < propertyNames.length-1) {
                            entityWrapper.le(propertyNames[i],filter.getMatchValue()).or();
                        }else{
                            entityWrapper.le(propertyNames[i],filter.getMatchValue());
                        }
                    }
                }else {
                    entityWrapper.le(filter.getPropertyName(),filter.getMatchValue());
                }
                break;
            case GE:
                if(isMulti){
                    propertyNames = filter.getPropertyNames();
                    for(int i= 0; i<propertyNames.length;i++){
                        if(i < propertyNames.length-1) {
                            entityWrapper.ge(propertyNames[i],filter.getMatchValue()).or();
                        }else{
                            entityWrapper.ge(propertyNames[i],filter.getMatchValue());
                        }
                    }
                }else {
                    entityWrapper.ge(filter.getPropertyName(),filter.getMatchValue());
                }
                break;
        }

    }
}
