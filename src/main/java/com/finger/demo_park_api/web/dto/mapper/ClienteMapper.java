package com.finger.demo_park_api.web.dto.mapper;

import com.finger.demo_park_api.entities.Cliente;
import com.finger.demo_park_api.entities.Usuario;
import com.finger.demo_park_api.web.dto.ClienteCreateDto;

import com.finger.demo_park_api.web.dto.ClienteResponseDto;
import com.finger.demo_park_api.web.dto.UsuarioResponseDto;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClienteMapper {

    public static Cliente toCliente(ClienteCreateDto dto) {
        return new ModelMapper().map(dto, Cliente.class);
    }

    public static ClienteResponseDto toDto(Cliente cliente) {
        return new ModelMapper().map(cliente, ClienteResponseDto.class);
    }

    public static List<ClienteResponseDto> toListDto(List<Cliente> clientes) {
        return clientes.stream().map(cliente -> toDto(cliente)).collect(Collectors.toList());
    }

}
