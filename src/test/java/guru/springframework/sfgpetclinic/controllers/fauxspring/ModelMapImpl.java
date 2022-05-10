package guru.springframework.sfgpetclinic.controllers.fauxspring;

import guru.springframework.sfgpetclinic.fauxspring.Model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: sean
 * Date: 2022/05/09
 */
public class ModelMapImpl implements Model {
  Map<String, Object> map = new HashMap<>();

  @Override
  public void addAttribute(String key, Object o) {
    map.put(key, o);
  }

  @Override
  public void addAttribute(Object o) {
//Do nothing...
  }

  public Map<String, Object> getMap() {
    return map;
  }
}
