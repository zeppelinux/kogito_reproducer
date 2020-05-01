package com.diligesoft.sheelon.beans;

import com.diligesoft.sheelon.model.rates.FactorType;
import org.kie.api.runtime.KieSession;
import org.kie.kogito.rules.KieRuntimeBuilder;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.HashMap;
import java.util.Map;

@Named
@RequestScoped
public class ScoreBean {

    @Inject
    KieRuntimeBuilder runtimeBuilder;


    public Map<FactorType, Object> getFactorValues() {
        KieSession factorsRules = runtimeBuilder.newKieSession("factors");
        Map<FactorType, Object> factors = new HashMap<>();
        factorsRules.setGlobal("factors", factors);
        factorsRules.fireAllRules();
        factorsRules.dispose();

        return factors;
    }
}
