package ma.tiwtiw.table.controller;

import ma.tiwtiw.core.controller.impl.BaseRestController;
import ma.tiwtiw.table.dto.TableDto;
import ma.tiwtiw.table.model.Table;
import ma.tiwtiw.table.service.TableService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tables")
public class TableController extends BaseRestController<Table, TableDto, String> {

  private final TableService tableService;

  private final ModelMapper modelMapper;

  public TableController(TableService tableService, ModelMapper modelMapper) {
    super(Table.class, TableDto.class);
    this.tableService = tableService;
    this.modelMapper = modelMapper;
  }

  @Override
  protected TableService getService() {
    return tableService;
  }

  @Override
  protected ModelMapper getMapper() {
    return modelMapper;
  }
}
