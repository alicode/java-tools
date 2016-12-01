package com.madding.shared.test.jca;

import java.security.Provider;
import java.security.Provider.Service;
import java.security.Security;
import java.util.Set;

public class ProviderTest {

    public static void main(String[] args) {
        ProviderTest test = new ProviderTest();
//        test.test_list_jce_provider();
        test.test_list_jce_service();
    }

    public void test_list_jce_provider() {
        Provider[] providers = Security.getProviders();
        for (int i = 0; i < providers.length; i++) {
            Provider provider = providers[i];
            String className = provider.getClass().getName();
            System.out.println("==" + provider.getName() + "," + provider.getVersion() + "," + className +  "========================");
            for (Object obj : provider.keySet()) {
                System.out.println(" " + obj + "=" +  provider.get(obj));
            }
        }
    }
    
    public void test_list_jce_service() {
        Provider[] providers = Security.getProviders();
        for (int i = 0; i < providers.length; i++) {
            Provider provider = providers[i];
            Set<Service> services = provider.getServices();
            String className = provider.getClass().getName();
            System.out.println("#####" + provider.getName() + "," + provider.getVersion() + "," + className +  "#####");
            for (Service service : services) {
                System.out.println(" " + service.getType() + "*" + service.getAlgorithm() + "*" +  service.getClassName());
            }
        }
    }
}
